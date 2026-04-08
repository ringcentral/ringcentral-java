package com.ringcentral;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.ringcentral.definitions.TokenInfo;
import java.io.IOException;
import org.junit.Test;

public class AuthorizationTest {
    @Test
    public void testAuthorize() throws IOException, RestException {
        RestClient rc =
                new RestClient(
                        System.getenv("RINGCENTRAL_CLIENT_ID"),
                        System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                        System.getenv("RINGCENTRAL_SERVER_URL"));

        TokenInfo token = rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));
        assertNotNull(token.access_token);
        assertNotNull(rc.token);
        rc.revoke();
        assertNull(rc.token);
    }
}
