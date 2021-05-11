package com.ringcentral.paths.restapi.glip.chats.read;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.chats.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.chats.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/read";
    }

    /**
     * Sets the specified chat status to {@literal '}Read{@literal '} for the current user.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/chats/{chatId}/read
     * Rate Limit Group: Medium
     * App Permission: GlipInternal
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
