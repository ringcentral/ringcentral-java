package com.ringcentral;

import com.ringcentral.definitions.Attachment;
import com.ringcentral.definitions.CreateMMSMessage;
import com.ringcentral.definitions.GetSMSMessageInfoResponse;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class MmsTest {
    @Test
    public void sendMms() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        GetSMSMessageInfoResponse response = rc.restapi().account().extension().mms().post(
            new CreateMMSMessage()
                .text("hello world")
                .from(new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_USERNAME")))
                .to(new MessageStoreCallerInfoRequest[]{
                    new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_RECEIVER"))
                })
                .attachments(
                    new Attachment[]{
                        new Attachment()
                            .filename("test.png")
                            .contentType("image/png")
                            .content(Files.readAllBytes(Paths.get("./src/test/resources/test.png")))
                    })
        );
        assertNotNull(response);
        assertNotNull(response.subject);
        assertTrue(response.subject.contains("hello world"));

        rc.revoke();
    }
}
