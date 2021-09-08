package com.ringcentral.paths.restapi.glip.webhooks.activate;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.webhooks.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.webhooks.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/activate";
    }

    /**
     * Activates a webhook by ID.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/webhooks/{webhookId}/activate
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public String post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return rb.string();
    }
}
