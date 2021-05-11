package com.ringcentral;

import com.ringcentral.definitions.Attachment;
import com.ringcentral.definitions.CreateIVRPromptRequest;
import com.ringcentral.definitions.IVRPrompts;
import com.ringcentral.definitions.PromptInfo;
import okhttp3.Request;
import okhttp3.Response;
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

        IVRPrompts ivrPrompts = rc.restapi().account().ivrPrompts().list();
        PromptInfo promptInfo = rc.restapi().account().ivrPrompts(ivrPrompts.records[0].id).get();
        Assert.assertNotNull(promptInfo.id);
        Assert.assertEquals(promptInfo.id, ivrPrompts.records[0].id);

//        ResponseBody responseBody = rc.get("/restapi/v1.0/account/~/ivr-prompts/"+ promptInfo.id + "/content");
//        byte[] bytes = responseBody.bytes();
//        assertTrue(bytes.length > 0);
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

        rc.httpEventListeners.add(new HttpEventListener() {
            @Override
            public void afterHttpCall(Response response, Request request) {
                String httpMessage = Utils.formatHttpMessage(response, request);
            }
        });

        PromptInfo promptInfo = rc.restapi().account().ivrPrompts().post(new CreateIVRPromptRequest()
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

        rc.httpEventListeners.add(new HttpEventListener() {
            @Override
            public void afterHttpCall(Response response, Request request) {
                String httpMessage = Utils.formatHttpMessage(response, request);
            }
        });

        IVRPrompts ivrPrompts = rc.restapi().account().ivrPrompts().list();
        PromptInfo promptInfo = rc.restapi().account().ivrPrompts(ivrPrompts.records[0].id).get();
        Assert.assertNotNull(promptInfo.id);

//        PromptInfo promptInfo = rc.restapi().account().ivrprompts().put(new CreateIvrPromptRequest()
//            .name("Uploaded via API")
//            .attachment(new Attachment()
//                .contentType("audio/mpeg")
//                .fileName("test.mp3")
//                .bytes(Files.readAllBytes(Paths.get("./src/test/resources/test.mp3")))
//            ));

        rc.revoke();
    }
}
