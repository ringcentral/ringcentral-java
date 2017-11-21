package com.ringcentral;


import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.definitions.CreateSMSMessage;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import com.ringcentral.paths.Sms;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ModelTest extends BaseTest {
    @Test
    public void testSms() throws IOException, RestException {
        CreateSMSMessage postParameters = new CreateSMSMessage();
        postParameters.from = new MessageStoreCallerInfoRequest().phoneNumber(config.get("username"));
        postParameters.to = new MessageStoreCallerInfoRequest[]{new MessageStoreCallerInfoRequest().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";
        String result = restClient.post("/restapi/v1.0/account/~/extension/~/sms", postParameters).string();
        assertEquals(true, result.contains("hello world"));
    }
}
