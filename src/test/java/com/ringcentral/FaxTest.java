package com.ringcentral;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FaxTest extends BaseTest {
    @Test
    public void testFax() throws IOException, RestException {
        RequestBody requestBody = new MultipartBody.Builder().setType(MultipartBody.MIXED)
            .addPart(RequestBody.create(MediaType.parse("application/json"),
                "{ \"to\": [{ \"phoneNumber\": " + config.get("receiver") + " }]}"))
            .addFormDataPart("attachment", "test.txt", RequestBody.create(MediaType.parse("text/plain"), "Hello world"))
            .addFormDataPart("attachment", "test.png", RequestBody.create(MediaType.parse("image/png"), Files.readAllBytes(Paths.get("./src/test/resources/test.png"))))
            .build();
        restClient.post("/restapi/v1.0/account/~/extension/~/fax", requestBody);
    }
}
