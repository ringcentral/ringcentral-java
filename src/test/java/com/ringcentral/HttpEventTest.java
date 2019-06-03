package com.ringcentral;

import com.ringcentral.definitions.CreateSMSMessage;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HttpEventTest {
    @Test
    public void afterHttpCall() throws IOException, RestException {
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

        final int[] count = {0};
        rc.httpEventListeners.add((response, request) -> {
            count[0] += 1;
            String httpMessage = Utils.formatHttpMessage(response, request);
            assertNotNull(httpMessage);
        });

        rc.restapi().account().extension().sms().post(
            new CreateSMSMessage()
                .text("hello world")
                .from(new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_USERNAME")))
                .to(new MessageStoreCallerInfoRequest[]{
                    new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_RECEIVER"))
                })
        );

        assertEquals(1, count[0]);

        rc.revoke();
    }

}
