package com.ringcentral;

import com.ringcentral.definitions.ReadUserCallLogParameters;
import com.ringcentral.definitions.RecordsCollectionResourceSubscriptionResponse;
import com.ringcentral.definitions.SubscriptionInfo;
import com.ringcentral.definitions.UserCallLogResponse;
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

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD")
        );

        RecordsCollectionResourceSubscriptionResponse resp = rc.restapi().subscription().list();
        for (SubscriptionInfo r : resp.records) {
            assertNotNull(r.status);
        }

        rc.revoke();
    }
}
