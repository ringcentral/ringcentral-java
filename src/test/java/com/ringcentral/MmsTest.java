package com.ringcentral;

import org.junit.Test;

import java.io.IOException;

public class MmsTest {
    @Test
    public void sendMms() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        // sandbox cannot send mms
//        GetSMSMessageInfoResponse response = rc.restapi().account().extension().mms().post(
//            new CreateMMSMessage()
//                .text("hello world")
//                .from(new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_USERNAME")))
//                .to(new MessageStoreCallerInfoRequest[]{
//                    new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_RECEIVER"))
//                })
//                .attachments(
//                    new Attachment[]{
//                        new Attachment()
//                            .filename("test.png")
//                            .contentType("image/png")
//                            .content(Files.readAllBytes(Paths.get("./src/test/resources/test.png")))
//                    })
//        );
//        assertNotNull(response);
//        assertNotNull(response.subject);
//        assertTrue(response.subject.contains("hello world"));

        rc.revoke();
    }
}
