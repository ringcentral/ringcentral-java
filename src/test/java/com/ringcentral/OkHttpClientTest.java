package com.ringcentral;

import okhttp3.*;
import java.util.concurrent.TimeUnit;
import com.ringcentral.definitions.CreateSMSMessage;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class OkHttpClientTest extends BaseTest {
    @Test
    public void testTimeout() throws IOException, RestException {
        restClient.SetOkHttpClient(new OkHttpClient.Builder()
            .connectTimeout(1, TimeUnit.MILLISECONDS)
            .writeTimeout(1, TimeUnit.MILLISECONDS)
            .readTimeout(1, TimeUnit.MILLISECONDS)
            .build()
        );
        CreateSMSMessage postParameters = new CreateSMSMessage();
        postParameters.from = new MessageStoreCallerInfoRequest().phoneNumber(config.get("username"));
        postParameters.to = new MessageStoreCallerInfoRequest[]{new MessageStoreCallerInfoRequest().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";
        try{
            restClient.post("/restapi/v1.0/account/~/extension/~/sms", postParameters).string();
            fail("Expected java.net.SocketTimeoutException was not thrown");
        } catch(java.net.SocketTimeoutException e) {
        } finally {
            restClient.SetOkHttpClient(new OkHttpClient());
        }
    }
}
