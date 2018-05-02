package com.ringcentral;

import com.ringcentral.definitions.CreateSMSMessage;
import com.ringcentral.definitions.MessageInfo;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SmsTest extends BaseTest {

    @Test
    public void sendSms() throws IOException, RestException {
        CreateSMSMessage postParameters = new CreateSMSMessage();
        postParameters.from = new MessageStoreCallerInfoRequest().phoneNumber(config.get("username"));
        postParameters.to = new MessageStoreCallerInfoRequest[]{new MessageStoreCallerInfoRequest().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";
        MessageInfo messageInfo = restClient.post("/restapi/v1.0/account/~/extension/~/sms", postParameters, MessageInfo.class);
        assertNotNull(messageInfo);
        assertEquals("SMS", messageInfo.type);
    }
}
