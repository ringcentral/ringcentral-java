package com.ringcentral;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class AuthorizeUriTest {
    @Test
    public void testAuthorizeUri() {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );
        String authorizeUri = rc.authorizeUri("http://localhost:8080/oauth2callback");
        assertNotNull(authorizeUri);
        assertTrue(authorizeUri.contains("state="));
        assertTrue(authorizeUri.contains("redirect_uri="));
        assertTrue(authorizeUri.contains("https://"));
        assertTrue(authorizeUri.contains("client_id="));
        assertTrue(authorizeUri.contains("oauth2callback"));
    }
}
