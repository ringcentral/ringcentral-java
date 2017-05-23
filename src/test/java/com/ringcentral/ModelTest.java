package com.ringcentral;


import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.paths.Sms;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ModelTest extends BaseTest {
    @Test
    public void testSms() throws IOException, RestException {
        Sms.PostParameters postParameters = new Sms.PostParameters();
        postParameters.from = new CallerInfo().phoneNumber(config.get("username"));
        postParameters.to = new CallerInfo[]{new CallerInfo().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";
        String result = restClient.post("/restapi/v1.0/account/~/extension/~/sms", postParameters).string();
        assertEquals(true, result.contains("hello world"));
    }
}
