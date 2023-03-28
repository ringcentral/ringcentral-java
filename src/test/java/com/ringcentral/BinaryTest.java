package com.ringcentral;

import com.ringcentral.definitions.Attachment;
import com.ringcentral.definitions.CreateUserProfileImageRequest;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

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

        String str = rc.restapi().account().extension().profileImage().post(new
            CreateUserProfileImageRequest()
            .image(new Attachment()
                .filename("test.png")
                .contentType("image/png")
                .content(Files.readAllBytes(Paths.get("./src/test/resources/test.png")))
            ));

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

        byte[] bytes =
            rc.restapi().account().extension().profileImage("90x90").get();
        Assert.assertNotNull(bytes);
        Assert.assertTrue(bytes.length > 0);

        byte[] bytes2 = rc.restapi().account().extension().profileImage().list();
        Assert.assertNotNull(bytes2);
        Assert.assertTrue(bytes2.length > 0);

        rc.revoke();
    }
}
