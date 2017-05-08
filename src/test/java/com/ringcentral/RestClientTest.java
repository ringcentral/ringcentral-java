package com.ringcentral;

import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.definitions.VersionInfo;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class RestClientTest extends BaseTest {
    @Test
    void testGet() throws IOException, RestException {
        VersionInfo versionInfo = restClient.get("/restapi/v1.0", VersionInfo.class);
        assertEquals("v1.0", versionInfo.uriString);
    }

    @Test
    void testPost() throws IOException, RestException {
        String result = restClient.post("/restapi/v1.0/account/~/extension/~/sms", new com.ringcentral.paths.sms.PostParameters(
            new CallerInfo(config.get("username")),
            new CallerInfo[]{new CallerInfo(config.get("receiver"))},
            "hello world"));
        assertEquals(true, result.contains("hello world"));
    }

    @Test
    void testAuthorize() throws IOException, RestException {
        restClient.authorize(config.get("username"), config.get("extension"), config.get("password"));
        assertEquals("bearer", restClient.getToken().token_type);
    }

    @Test
    void testRefresh() throws IOException, RestException {
        restClient.refresh();
        assertEquals("bearer", restClient.getToken().token_type);
    }

    @Test
    void testRevoke() throws IOException, RestException {
        restClient.revoke();
        assertTrue(restClient.getToken() == null);
        restClient.authorize(config.get("username"), config.get("extension"), config.get("password"));
    }

    @Test
    void testRestException() {
        RestException exception = assertThrows(RestException.class, () -> restClient.get("/restapi/v1.0/account/~/invalid-url"));
        assertTrue(exception.getMessage().contains("Invalid URI"));
        assertEquals(404, exception.getHttpStatusCode());
    }

    @Test
    void testAuthorizeUri() {
        String uri = restClient.authorizeUri("http://localhost:8080/callback", "myState");
        assertTrue(uri.contains("/restapi/oauth/authorize"));
        assertTrue(uri.contains("response_type=code"));
        assertTrue(uri.contains("state=myState"));
        assertTrue(uri.contains("redirect_uri="));
        assertTrue(uri.contains("client_id="));
    }
}
