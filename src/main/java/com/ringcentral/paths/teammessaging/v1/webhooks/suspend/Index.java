package com.ringcentral.paths.teammessaging.v1.webhooks.suspend;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.webhooks.Index parent;

    public Index(com.ringcentral.paths.teammessaging.v1.webhooks.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/suspend";
    }

    /**
     * Suspends a webhook by ID.
     * HTTP Method: post
     * Endpoint: /team-messaging/v1/webhooks/{webhookId}/suspend
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
