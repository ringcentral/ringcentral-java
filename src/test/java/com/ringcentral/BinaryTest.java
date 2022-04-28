package com.ringcentral;

import org.junit.Test;

import java.io.IOException;

public class BinaryTest {
    @Test
    public void uploadProfileImage() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL"));

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD"));

        // todo: https://jira.ringcentral.com/browse/OPS-277406
        // String str = rc.restapi().account().extension().profileImage().post(new
        // CreateUserProfileImageRequest()
        // .image(new Attachment()
        // .filename("test.png")
        // .contentType("image/png")
        // .content(Files.readAllBytes(Paths.get("./src/test/resources/test.png")))
        // ));

        rc.revoke();
    }

    @Test
    public void downloadProfileImage() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL"));

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD"));

        // todo: https://jira.ringcentral.com/browse/OPS-277406
        // byte[] bytes =
        // rc.restapi().account().extension().profileImage("90x90").get();
        // assertNotNull(bytes);

        // byte[] bytes2 = rc.restapi().account().extension().profileImage().list();
        // assertNotNull(bytes2);
        // assertTrue(bytes2.length > 0);

        rc.revoke();
    }
}
