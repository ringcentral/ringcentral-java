package com.ringcentral;

import org.junit.Test;

import java.io.IOException;

public class ConsumeTextTest {
    @Test
    public void updateGlipPostText() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        String groupId = rc.teamMessaging().v1().chats().list().records[0].id;
        rc.teamMessaging().v1().chats(groupId).posts().list();

        rc.revoke();
    }
}
