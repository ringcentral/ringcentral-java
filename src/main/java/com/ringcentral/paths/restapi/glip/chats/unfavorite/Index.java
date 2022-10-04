package com.ringcentral.paths.restapi.glip.chats.unfavorite;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.chats.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/unfavorite";
    }

    /**
     * Removes the specified chat from the users&#039;s list of favorite chats.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/unfavorite
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
