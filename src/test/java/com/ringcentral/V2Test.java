package com.ringcentral;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class V2Test {
    @Test
    public void GetAccountInfo() throws IOException, RestException {

        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );
        String path = rc.restapi().v2().accounts().path();
        Assert.assertEquals("/restapi/v2/accounts/~", path);
    }
}
