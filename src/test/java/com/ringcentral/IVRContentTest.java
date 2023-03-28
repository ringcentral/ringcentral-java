package com.ringcentral;

import com.ringcentral.definitions.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IVRContentTest {
    @Test
    public void downloadIVRPromptContent() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD")
        );

        IvrPrompts ivrPrompts = rc.restapi().account().ivrPrompts().list();
        PromptInfo promptInfo = rc.restapi().account().ivrPrompts(ivrPrompts.records[0].id).get();
        Assert.assertNotNull(promptInfo.id);
        Assert.assertEquals(promptInfo.id, ivrPrompts.records[0].id);

        byte[] bytes = rc.get(promptInfo.contentUri).bytes();
        Assert.assertTrue(bytes.length > 0);
        rc.revoke();
    }

    @Test
    public void createIVRPromptContent() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD")
        );

        rc.restapi().account().ivrPrompts().post(new CreateIVRPromptRequest()
            .name("Uploaded via API")
            .attachment(new Attachment()
                .contentType("audio/mpeg")
                .filename("test.mp3")
                .content(Files.readAllBytes(Paths.get("./src/test/resources/test.mp3")))
            ));

        rc.revoke();
    }

    @Test
    public void updateIVRPromptContent() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD")
        );

        IvrPrompts ivrPrompts = rc.restapi().account().ivrPrompts().list();
        PromptInfo promptInfo = rc.restapi().account().ivrPrompts(ivrPrompts.records[0].id).get();
        Assert.assertNotNull(promptInfo.id);

        rc.restapi().account().ivrPrompts(promptInfo.id).put(new UpdateIVRPromptRequest()
            .filename("test.mp3"));

        rc.revoke();
    }
}
