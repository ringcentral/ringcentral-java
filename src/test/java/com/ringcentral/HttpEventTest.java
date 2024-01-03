package com.ringcentral;

import com.ringcentral.definitions.CreateInternalTextMessageRequest;
import com.ringcentral.definitions.PagerCallerInfoRequest;
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

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        final int[] count = {0};
        rc.httpEventListeners.add((response, request) -> {
            count[0] += 1;
            String httpMessage = Utils.formatHttpMessage(response, request);
            assertNotNull(httpMessage);
        });

        rc.restapi().account().extension().companyPager().post(
            new CreateInternalTextMessageRequest()
                .text("hello world")
                .from(new PagerCallerInfoRequest().extensionId(rc.token.owner_id))
                .to(new PagerCallerInfoRequest[]{
                    new PagerCallerInfoRequest().extensionId(rc.token.owner_id)
                })
        );

        assertEquals(1, count[0]);

        rc.revoke();
    }

}
