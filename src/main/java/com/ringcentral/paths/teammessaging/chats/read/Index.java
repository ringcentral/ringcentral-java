package com.ringcentral.paths.teammessaging.chats.read;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.chats.Index parent;

    public Index(com.ringcentral.paths.teammessaging.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/read";
    }

    /**
     * Sets the specified chat status to &#039;Read&#039; for the current user.
     * HTTP Method: post
     * Endpoint: /team-messaging/{version}/chats/{chatId}/read
     * Rate Limit Group: Medium
     * App Permission: TeamMessagingInternal
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
