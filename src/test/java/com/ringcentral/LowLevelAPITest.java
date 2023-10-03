package com.ringcentral;

import com.ringcentral.definitions.GetExtensionInfoResponse;
import okhttp3.ResponseBody;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class LowLevelAPITest {
    @Test
    public void testParseObject() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));
        ResponseBody responseBody = rc.get("/restapi/v1.0/account/~/extension/~", null);
        String responseString = responseBody.string();
        GetExtensionInfoResponse extensionInfo = Utils.gson.fromJson(responseString, GetExtensionInfoResponse.class);
        assertNotNull(extensionInfo);
        assertNotNull(extensionInfo.extensionNumber);

        rc.revoke();
    }
}
