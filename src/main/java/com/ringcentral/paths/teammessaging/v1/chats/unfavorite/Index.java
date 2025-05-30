package com.ringcentral.paths.teammessaging.v1.chats.unfavorite;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.chats.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/unfavorite";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Removes the specified chat from the users&#039;s list of favorite chats.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/chats/{chatId}/unfavorite
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
