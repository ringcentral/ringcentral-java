package com.ringcentral;

import okhttp3.ResponseBody;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class BinaryTest extends BaseTest {
    @Test
    public void testDownloadProfileImage() throws IOException, RestException {
        byte[] bytes = restClient.get("/restapi/v1.0/account/~/extension/~/profile-image").bytes();
        assertTrue(bytes.length > 0);
        FileOutputStream fos = new FileOutputStream("/tmp/temp.png");
        try {
            fos.write(bytes);
        } finally {
            fos.close();
        }
    }

    @Test
    public void testUploadProfileImage() throws IOException, RestException {
        // upload
        byte[] bytes1 = Files.readAllBytes(Paths.get("./src/test/resources/test.png"));
        ResponseBody response = restClient.postBinary("/restapi/v1.0/account/~/extension/~/profile-image",
            "image","test.png", "image/png", bytes1);

        // download
        byte[] bytes2 = restClient.get("/restapi/v1.0/account/~/extension/~/profile-image").bytes();

        assertArrayEquals(bytes1, bytes2);
    }
}
