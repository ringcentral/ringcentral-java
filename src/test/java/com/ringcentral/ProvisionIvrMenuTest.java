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

        rc.authorize(
            System.getenv("RINGCENTRAL_USERNAME"),
            System.getenv("RINGCENTRAL_EXTENSION"),
            System.getenv("RINGCENTRAL_PASSWORD")
        );

        IVRMenuInfo iVRMenuInfo = rc.restapi().account().ivrMenus().post(new IVRMenuInfo().extensionNumber("2002").name("My IVR menu"));
        assertNotNull(iVRMenuInfo);

        String str = rc.restapi().account().extension(iVRMenuInfo.id).delete();

        rc.revoke();
    }
}
