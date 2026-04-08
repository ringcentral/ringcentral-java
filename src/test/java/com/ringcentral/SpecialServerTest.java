package com.ringcentral;

import static org.junit.Assert.assertEquals;

import okhttp3.HttpUrl;
import org.junit.Test;

public class SpecialServerTest {
    @Test
    public void testPathname() {
        HttpUrl.Builder urlBuilder =
                HttpUrl.parse("http://xmn-mck01.int.rclabenv.com:65003/pubapi")
                        .newBuilder()
                        .addPathSegments("team-messaging/v1/teams");
        String url = urlBuilder.build().toString();
        assertEquals(url, "http://xmn-mck01.int.rclabenv.com:65003/pubapi/team-messaging/v1/teams");
    }
}
