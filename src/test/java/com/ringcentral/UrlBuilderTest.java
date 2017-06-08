package com.ringcentral;

import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.definitions.MessageInfo;
import com.ringcentral.definitions.VersionInfo;
import com.ringcentral.paths.Sms;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.*;

public class UrlBuilderTest extends BaseTest {
    @Test
    public void TestRestApi() {
        String endpoint = restClient.restApi("v1.0").endpoint();
        assertEquals("/restapi/v1.0", endpoint);

        endpoint = restClient.restApi(null).endpoint();
        assertEquals("/restapi", endpoint);

        endpoint = restClient.restApi().endpoint();
        assertEquals("/restapi/v1.0", endpoint);
    }

    @Test
    public void TestAccount() {
        String endpoint = restClient.restApi("v1.0").account().endpoint();
        assertEquals("/restapi/v1.0/account/~", endpoint);

        endpoint = restClient.restApi("v1.0").account(null).endpoint();
        assertEquals("/restapi/v1.0/account", endpoint);

        endpoint = restClient.restApi("v1.0").account("~").endpoint();
        assertEquals("/restapi/v1.0/account/~", endpoint);
    }

    @Test
    public void TestSms() throws IOException, RestException {
        String endpoint = restClient.restApi().account().extension().sms().endpoint();
        assertEquals("/restapi/v1.0/account/~/extension/~/sms", endpoint);

        Sms.PostParameters postParameters = new Sms.PostParameters();
        postParameters.from = new CallerInfo().phoneNumber(config.get("username"));
        postParameters.to = new CallerInfo[]{new CallerInfo().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";

        MessageInfo messageInfo = restClient.restApi().account().extension().sms().post(postParameters, MessageInfo.class);
        assertNotNull(messageInfo);
        assertEquals("SMS", messageInfo.type);

        String result = restClient.restApi().account().extension().sms().post(postParameters).string();
        assertTrue(result.contains("SMS"));
    }

    @Test
    public void TestGet() throws IOException, RestException {
        assertTrue(restClient.restApi().get().string().contains("v1.0"));
        VersionInfo versionInfo = restClient.restApi().get(VersionInfo.class);
        assertEquals("v1.0", versionInfo.uriString);
    }

    @Test
    public void TestFax() throws IOException, RestException {
        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.MIXED)
            .addPart(RequestBody.create(MediaType.parse("application/json"),
                "{ \"to\": [{ \"phoneNumber\": " + config.get("receiver") + " }]}"))
            .addFormDataPart("attachment", "test.txt", RequestBody.create(MediaType.parse("text/plain"), "Hello world"))
            .addFormDataPart("attachment", "test.png", RequestBody.create(MediaType.parse("image/png"), Files.readAllBytes(Paths.get("./src/test/resources/test.png"))))
            .build();
        restClient.restApi().account().extension().fax().post(requestBody);
    }
}
