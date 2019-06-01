package com.ringcentral;

import com.ringcentral.definitions.CreateSMSMessage;
import com.ringcentral.definitions.GetMessageInfoResponse;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SmsTest {
    @Test
    public void sendSms() throws IOException, RestException {
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

        GetMessageInfoResponse response = rc.restapi().account().extension().sms().post(
                new CreateSMSMessage()
                        .text("hello world")
                        .from(new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_USERNAME")))
                        .to(new MessageStoreCallerInfoRequest[]{
                                new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_RECEIVER"))
                        })
        );
        assertNotNull(response);
        assertNotNull(response.subject);
        assertTrue(response.subject.contains("hello world"));

        rc.revoke();
    }

    @Test
    public void sendSms2() throws IOException, RestException {
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

        CreateSMSMessage requestBody = new CreateSMSMessage();
        requestBody.text = "hello world";
        requestBody.from = new MessageStoreCallerInfoRequest();
        requestBody.from.phoneNumber = System.getenv("RINGCENTRAL_USERNAME");
        MessageStoreCallerInfoRequest callee = new MessageStoreCallerInfoRequest();
        callee.phoneNumber = System.getenv("RINGCENTRAL_RECEIVER");
        requestBody.to = new MessageStoreCallerInfoRequest[]{callee};

        GetMessageInfoResponse response = rc.restapi().account().extension().sms().post(requestBody);
        assertNotNull(response);
        assertNotNull(response.subject);
        assertTrue(response.subject.contains("hello world"));

        rc.revoke();
    }
}
