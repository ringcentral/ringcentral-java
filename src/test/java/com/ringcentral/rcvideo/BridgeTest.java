package com.ringcentral.rcvideo;

import com.ringcentral.ConstantContent;
import com.ringcentral.RestClient;
import com.ringcentral.RestException;
import com.ringcentral.definitions.BridgeResponse;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class BridgeTest {
    private RestClient rc;

    @Before
    public void setUp() throws RestException, IOException {
        rc = new RestClient(System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL"));
        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

    }

    @After
    public void revokeAccessToken() throws RestException, IOException {
        rc.revoke();

    }

    @Test
    public void testCreateBridge() throws RestException, IOException {
        BridgeResponse bridgeResponse =
            rc.rcvideo().v2().account("~").extension("~").bridges()
                .post(ConstantContent.createBridgeRequest());
        Assert.assertEquals(bridgeResponse.name, "RC Video Test");
        Assert.assertEquals(bridgeResponse.type, "Instant");
        Assert.assertNotNull(bridgeResponse.id);
        String deletedResponse = rc.rcvideo().v2().bridges(bridgeResponse.id).delete();
        Assert.assertEquals("", deletedResponse);
    }

    @Test
    public void testFindBridgeByBridgeId() throws RestException, IOException {
        BridgeResponse bridgeResponse =
            rc.rcvideo().v2().account("~").extension("~").bridges()
                .post(ConstantContent.createBridgeRequest());
        BridgeResponse bridgeResponseByGet =
            rc.rcvideo().v2().bridges(bridgeResponse.id).get();
        Assert.assertEquals(bridgeResponse.name, bridgeResponseByGet.name);
        Assert.assertEquals(bridgeResponse.type, bridgeResponseByGet.type);
        String deletedResponse = rc.rcvideo().v2().bridges(bridgeResponse.id).delete();
        Assert.assertEquals("", deletedResponse);

    }

    @Test
    public void testDeleteBridgeByBridgeId() throws RestException, IOException {
        BridgeResponse bridgeResponse =
            rc.rcvideo().v2().account("~").extension("~").bridges()
                .post(ConstantContent.createBridgeRequest());
        String deleteBridge =
            rc.rcvideo().v2().bridges(bridgeResponse.id).delete();
        Assert.assertEquals("", deleteBridge);
    }

    @Test
    public void testUpdateBridge() throws RestException, IOException {
        BridgeResponse bridgeResponse =
            rc.rcvideo().v2().account("~").extension("~").bridges().post(
                ConstantContent.createBridgeRequest());
        BridgeResponse updatedBridgeResponse =
            rc.rcvideo().v2().bridges(bridgeResponse.id)
                .patch(ConstantContent.updateBridgeRequest());
        Assert.assertEquals("Update RC Video Test", updatedBridgeResponse.name);
        String deletedResponse = rc.rcvideo().v2().bridges(bridgeResponse.id).delete();
        Assert.assertEquals("", deletedResponse);
    }

    @Test
    public void testFindDefaultBridge() throws RestException, IOException {
        BridgeResponse bridgeResponse =
            rc.rcvideo().v2().account("~").extension("~").bridges().default1()
                .get();
        Assert.assertTrue(bridgeResponse.name.contains("Video meeting"));
        ;
        Assert.assertEquals("PMI", bridgeResponse.type);
    }

    @Test
    public void testfindBridgeUsingHostPSTPin()
        throws RestException, IOException {
        BridgeResponse bridgeResponse =
            rc.rcvideo().v2().account("~").extension("~").bridges()
                .post(ConstantContent.createBridgeRequest());
        BridgeResponse bridgeResponseByhost = rc.rcvideo().v2().bridges().pin()
            .pstn(bridgeResponse.pins.pstn.host).get();
        Assert.assertEquals("RC Video Test", bridgeResponseByhost.name);
        String deletedResponse = rc.rcvideo().v2().bridges(bridgeResponse.id).delete();
        Assert.assertEquals("", deletedResponse);
    }

    @Test
    public void testfindBridgeUsingParticipantPSTPin()
        throws RestException, IOException {
        BridgeResponse bridgeResponse =
            rc.rcvideo().v2().account("~").extension("~").bridges()
                .post(ConstantContent.createBridgeRequest());
        BridgeResponse bridgeResponseByhost = rc.rcvideo().v2().bridges().pin()
            .pstn(bridgeResponse.pins.pstn.participant).get();
        Assert.assertEquals("RC Video Test", bridgeResponseByhost.name);
        String deletedResponse = rc.rcvideo().v2().bridges(bridgeResponse.id).delete();
        Assert.assertEquals("", deletedResponse);
    }

    @Test
    public void testfindBridgeUsingWebPin() throws RestException, IOException {
        BridgeResponse bridgeResponse =
            rc.rcvideo().v2().account("~").extension("~").bridges()
                .post(ConstantContent.createBridgeRequest());
        BridgeResponse bridgeResponseByhost = rc.rcvideo().v2().bridges().pin().web(bridgeResponse.pins.web).get();
        Assert.assertEquals("RC Video Test", bridgeResponseByhost.name);
        String deletedResponse = rc.rcvideo().v2().bridges(bridgeResponse.id).delete();
        Assert.assertEquals("", deletedResponse);
    }

}

