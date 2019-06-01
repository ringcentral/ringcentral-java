package com.ringcentral;

import com.ringcentral.definitions.TokenInfo;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class AuthorizationTest {
    @Test
    public void testAuthorize() throws IOException, RestException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        TokenInfo token = rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );
        assertNotNull(token.access_token);
        assertNotNull(rc.token);
        rc.revoke();
        assertNull(rc.token);
    }
}