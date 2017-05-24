package com.ringcentral;

import com.ringcentral.definitions.TokenInfo;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AuthorizationTest extends BaseTest {
    @Test
    public void testAuthorize() throws IOException, RestException {
        restClient.authorize(config.get("username"), config.get("extension"), config.get("password"));
        assertEquals("bearer", restClient.getToken().token_type);
    }

    @Test
    public void testRefresh() throws IOException, RestException {
        restClient.refresh();
        assertEquals("bearer", restClient.getToken().token_type);
    }

    @Test
    public void testRevoke() throws IOException, RestException {
        restClient.revoke();
        assertTrue(restClient.getToken() == null);
        restClient.revoke(); // revoke again should cause no exception
        restClient.refresh(); // refresh after revoke should cause no exception
        restClient.authorize(config.get("username"), config.get("extension"), config.get("password"));
    }

    @Test
    public void testAuthorizeUri() {
        String uri = restClient.authorizeUri("http://localhost:8080/callback", "myState");
        assertTrue(uri.contains("/restapi/oauth/authorize"));
        assertTrue(uri.contains("response_type=code"));
        assertTrue(uri.contains("state=myState"));
        assertTrue(uri.contains("redirect_uri="));
        assertTrue(uri.contains("client_id="));

        uri = restClient.authorizeUri("http://localhost:8080/callback");
        assertTrue(uri.contains("/restapi/oauth/authorize"));
        assertTrue(uri.contains("response_type=code"));
        assertTrue(uri.contains("state="));
        assertTrue(uri.contains("redirect_uri="));
        assertTrue(uri.contains("client_id="));
    }

    @Test
    public void testAuthByCode() throws IOException {
        try {
            restClient.authorize("auth_code", "http://baidu.com");
        } catch (RestException re) {
            assertEquals(401, re.getHttpStatusCode());
            assertTrue(re.getMessage().contains("TokenInvalid"));
        }
    }

    @Test
    public void testAutoRefresh() throws InterruptedException {
        restClient.refresh();
        TokenInfo tokenInfo = restClient.getToken();
        tokenInfo.expires_in = 123L;
        restClient.setToken(tokenInfo);
        Thread.sleep(6000);
        assertEquals("bearer", restClient.getToken().token_type);
    }
}
