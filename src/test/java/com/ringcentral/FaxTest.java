package com.ringcentral;

import com.ringcentral.definitions.Attachment;
import com.ringcentral.definitions.CreateFaxMessageRequest;
import com.ringcentral.definitions.FaxResponse;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertNotNull;

public class FaxTest {
    @Test
    public void sendFax() throws IOException, RestException {
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

        FaxResponse r = rc.restapi().account().extension().fax().post(
                new CreateFaxMessageRequest()
                        .to(new MessageStoreCallerInfoRequest[]{
                                new MessageStoreCallerInfoRequest()
                                        .phoneNumber(System.getenv("RINGCENTRAL_USERNAME"))
                        })
                        .attachments(
                                new Attachment[]{
                                        new Attachment()
                                                .fileName("test.txt")
                                                .contentType("text/plain")
                                                .bytes("hello world".getBytes(StandardCharsets.UTF_8)),
                                        new Attachment()
                                                .fileName("test.png")
                                                .contentType("image/png")
                                                .bytes(Files.readAllBytes(Paths.get("./src/test/resources/test.png")))
                                })
        );

        assertNotNull(r);
        assertNotNull(r.direction);

        rc.revoke();
    }
}
