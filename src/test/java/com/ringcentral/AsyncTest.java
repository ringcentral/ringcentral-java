package com.ringcentral;

import com.ringcentral.definitions.VersionInfo;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class AsyncTest extends BaseTest {

    @Test
    public void testAsync() throws InterruptedException {
        final VersionInfo[] versionInfos = {null};
        new Thread(() -> {
            try {
                versionInfos[0] = restClient.get("/restapi/v1.0", VersionInfo.class);
            } catch (IOException | RestException e) {
                e.printStackTrace();
            }
        }).start();
        Thread.sleep(3000);
        assertEquals("v1.0", versionInfos[0].uriString);
    }

}
