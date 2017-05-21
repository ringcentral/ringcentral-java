package com.ringcentral;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.junit.Test;

import java.io.IOException;

public class FaxTest extends BaseTest {
    @Test
    public void testFax() throws IOException, RestException {
        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.MIXED)
            .addPart(RequestBody.create(MediaType.parse("application/json"),
                "{ \"to\": [{ \"phoneNumber\": " + config.get("receiver") + " }]}"))
            .addFormDataPart("attachment", "test.txt", RequestBody.create(MediaType.parse("text/plain"), "Hello world".getBytes()))
            .build();
        ResponseBody responseBody = restClient.post("/restapi/v1.0/account/~/extension/~/fax", requestBody);
    }
}
