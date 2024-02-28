package com.ringcentral;

import com.ringcentral.definitions.Attachment;
import com.ringcentral.definitions.CreateFaxMessageRequest;
import com.ringcentral.definitions.FaxReceiver;
import com.ringcentral.definitions.FaxResponse;
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

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        FaxResponse r = rc.restapi().account().extension().fax().post(
            new CreateFaxMessageRequest()
                .to(new FaxReceiver[]{
                    new FaxReceiver()
                        .phoneNumber(System.getenv("RINGCENTRAL_RECEIVER"))
                })
                .attachments(
                    new Attachment[]{
                        new Attachment()
                            .filename("test.txt")
                            .contentType("text/plain")
                            .content("hello world".getBytes(StandardCharsets.UTF_8)),
                        new Attachment()
                            .filename("test.png")
                            .contentType("image/png")
                            .content(Files.readAllBytes(Paths.get("./src/test/resources/test.png")))
                    })
        );

        assertNotNull(r);
        assertNotNull(r.direction);

        rc.revoke();
    }
}
