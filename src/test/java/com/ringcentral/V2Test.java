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
//
//        rc.authorize(
//            System.getenv("RINGCENTRAL_USERNAME"),
//            System.getenv("RINGCENTRAL_EXTENSION"),
//            System.getenv("RINGCENTRAL_PASSWORD")
//        );
//
//        GetSMSMessageInfoResponse response = rc.restapi().account().extension().sms().post(
//            new CreateSMSMessage()
//                .text("hello world")
//                .from(new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_USERNAME")))
//                .to(new MessageStoreCallerInfoRequest[]{
//                    new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_RECEIVER"))
//                })
//        );
//        assertNotNull(response);
//        assertNotNull(response.subject);
//        assertTrue(response.subject.contains("hello world"));
//
//        rc.revoke();
    }
}
