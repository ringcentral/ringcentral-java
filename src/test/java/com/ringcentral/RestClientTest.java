package com.ringcentral;

import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.definitions.VersionInfo;
import com.ringcentral.paths.Sms;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;


public class RestClientTest extends BaseTest {
    @Test
    public void testGet() throws IOException, RestException {
        VersionInfo versionInfo = restClient.get("/restapi/v1.0", VersionInfo.class);
        assertEquals("v1.0", versionInfo.uriString);
    }

    @Test
    public void testPost() throws IOException, RestException {
        Sms.PostParameters postParameters = new Sms.PostParameters();
        postParameters.from = new CallerInfo().phoneNumber(config.get("username"));
        postParameters.to = new CallerInfo[]{new CallerInfo().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";
        String result = restClient.post("/restapi/v1.0/account/~/extension/~/sms", postParameters).string();
        assertEquals(true, result.contains("hello world"));
    }

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
        restClient.authorize(config.get("username"), config.get("extension"), config.get("password"));
    }

    @Test
    public void testRestException() {
        try {
            restClient.get("/restapi/v1.0/account/~/invalid-url");
            fail("Expected RestException was not thrown");
        } catch (RestException e) {
            assertTrue(e.getMessage().contains("HTTP status code: 404"));
            assertTrue(e.getMessage().contains("Invalid URI"));
            assertEquals(404, e.getHttpStatusCode());
        } catch (IOException e) {
            fail("Unexpected IOException was thrown");
        }
    }

    @Test
    public void testAuthorizeUri() {
        String uri = restClient.authorizeUri("http://localhost:8080/callback", "myState");
        assertTrue(uri.contains("/restapi/oauth/authorize"));
        assertTrue(uri.contains("response_type=code"));
        assertTrue(uri.contains("state=myState"));
        assertTrue(uri.contains("redirect_uri="));
        assertTrue(uri.contains("client_id="));
    }
}
