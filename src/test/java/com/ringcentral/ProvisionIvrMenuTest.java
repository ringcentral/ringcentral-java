package com.ringcentral;

import static org.junit.Assert.assertNotNull;

import com.ringcentral.definitions.IvrMenuInfo;
import com.ringcentral.definitions.IvrMenuInfoCreate;
import java.io.IOException;
import org.junit.Test;

public class ProvisionIvrMenuTest {
    @Test
    public void CreateAndDeleteIVRMenu() throws IOException, RestException {
        RestClient rc =
                new RestClient(
                        System.getenv("RINGCENTRAL_CLIENT_ID"),
                        System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                        System.getenv("RINGCENTRAL_SERVER_URL"));

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        IvrMenuInfo ivrMenuInfo =
                rc.restapi()
                        .account()
                        .ivrMenus()
                        .post(new IvrMenuInfoCreate().extensionNumber("11909").name("My IVR menu"));
        assertNotNull(ivrMenuInfo);

        // delete endpoint deprecated, we have to use string endpoint instead.
        String str = rc.delete("/restapi/v1.0/account/~/extension/" + ivrMenuInfo.id).string();
        assertNotNull(str);

        rc.revoke();
    }
}
