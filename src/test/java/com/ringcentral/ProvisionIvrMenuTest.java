package com.ringcentral;

import com.ringcentral.definitions.IVRMenuInfo;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class ProvisionIvrMenuTest {
    @Test
    public void CreateAndDeleteIVRMenu() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        IVRMenuInfo iVRMenuInfo = rc.restapi().account().ivrMenus().post(new IVRMenuInfo().extensionNumber("11909").name("My IVR menu"));
        assertNotNull(iVRMenuInfo);

        // delete endpoint deprecated, we have to use string endpoint instead.
        String str = rc.delete("/restapi/v1.0/account/~/extension/" + iVRMenuInfo.id).string();
        assertNotNull(str);

        rc.revoke();
    }
}
