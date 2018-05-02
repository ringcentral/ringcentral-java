package com.ringcentral;

import org.junit.Test;

import java.io.IOException;

import com.ringcentral.definitions.MakeRingOutCallerInfoRequestFrom;
import com.ringcentral.definitions.MakeRingOutCallerInfoRequestTo;
import com.ringcentral.definitions.MakeRingOutRequest;

public class RingOutTest extends BaseTest {
    @Test
    public void testRingOut() throws IOException, RestException {
        MakeRingOutRequest requestBody = new MakeRingOutRequest()
            .from(new MakeRingOutCallerInfoRequestFrom().phoneNumber(config.get("username")))
            .to(new MakeRingOutCallerInfoRequestTo().phoneNumber(config.get("receiver")));
        restClient.post("/restapi/v1.0/account/~/extension/~/ring-out", requestBody);
    }
}
