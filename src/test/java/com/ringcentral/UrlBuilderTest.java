package com.ringcentral;

import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.definitions.MessageInfo;
import com.ringcentral.definitions.VersionInfo;
import com.ringcentral.paths.Sms;
import org.junit.Test;

import java.io.IOException;

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
    public void TestSms() {
        String endpoint = restClient.restApi().account().extension().sms().endpoint();
        assertEquals("/restapi/v1.0/account/~/extension/~/sms", endpoint);
    }

    @Test
    public void TestGet() throws IOException, RestException {
        assertTrue(restClient.restApi().get().string().contains("v1.0"));
        VersionInfo versionInfo = restClient.restApi().get(VersionInfo.class);
        assertEquals("v1.0", versionInfo.uriString);
    }

    @Test
    public void TestPost() throws IOException, RestException {
        Sms.PostParameters postParameters = new Sms.PostParameters();
        postParameters.from = new CallerInfo().phoneNumber(config.get("username"));
        postParameters.to = new CallerInfo[]{new CallerInfo().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";
        MessageInfo messageInfo = restClient.restApi().account().extension().sms().post(postParameters, MessageInfo.class);
        assertNotNull(messageInfo);
        assertEquals("SMS", messageInfo.type);
    }
}
