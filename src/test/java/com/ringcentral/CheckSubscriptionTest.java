package com.ringcentral;

import com.ringcentral.definitions.SubscriptionInfo;
import com.ringcentral.definitions.SubscriptionListResource;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class CheckSubscriptionTest {
    @Test
    public void listSubscriptions() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        SubscriptionListResource resp = rc.restapi().subscription().list();
        for (SubscriptionInfo r : resp.records) {
            assertNotNull(r.status);
        }

        rc.revoke();
    }
}
