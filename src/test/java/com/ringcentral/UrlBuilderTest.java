package com.ringcentral;

import com.ringcentral.definitions.*;
import com.ringcentral.paths.AddressBook;
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

        CreateSMSMessage postParameters = new CreateSMSMessage();
        postParameters.from = new MessageStoreCallerInfoRequest().phoneNumber(config.get("username"));
        postParameters.to = new MessageStoreCallerInfoRequest[]{new MessageStoreCallerInfoRequest().phoneNumber(config.get("receiver"))};
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

    @Test
    public void testUploadProfileImage() throws IOException, RestException {
        // upload
        byte[] bytes1 = Files.readAllBytes(Paths.get("./src/test/resources/test.png"));

        restClient.restApi().account().extension().profileImage()
            .postBinary("image", "test.png", "image/png", bytes1);

        // download
        byte[] bytes2 = restClient.restApi().account().extension().profileImage().get().bytes();

        assertArrayEquals(bytes1, bytes2);
    }

    @Test
    public void testAddressBook() throws IOException, RestException {
        AddressBook addressBook = restClient.restApi().account().extension().addressBook();

        PersonalContactInfo contactInfo = new PersonalContactInfo().firstName("Tyler").lastName("Long").homePhone("+15889546648");

        PersonalContactInfo personalContactInfo = addressBook.contact().post(
            contactInfo, PersonalContactInfo.class);
        assertEquals("+15889546648", personalContactInfo.homePhone);

        contactInfo = contactInfo.homePhone("+15889546647");
        String str = addressBook.contact(personalContactInfo.id).put(contactInfo).string();
        assertTrue(str.contains("+15889546647"));

        contactInfo = contactInfo.homePhone("+15889546646");
        PersonalContactInfo personalContactInfo2 = addressBook.contact(personalContactInfo.id).put(contactInfo, PersonalContactInfo.class);
        assertEquals("+15889546646", personalContactInfo2.homePhone);

        addressBook.contact(personalContactInfo.id).delete();
    }
}
