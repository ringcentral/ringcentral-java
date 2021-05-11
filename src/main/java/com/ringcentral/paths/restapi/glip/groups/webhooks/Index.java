package com.ringcentral.paths.restapi.glip.groups.webhooks;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.GlipWebhookInfo;
import com.ringcentral.definitions.GlipWebhookList;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.groups.Index parent;

    public Index(com.ringcentral.paths.restapi.glip.groups.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/webhooks";
    }

    /**
     * Returns webhooks which are available for the current user by group ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/groups/{groupId}/webhooks
     * Rate Limit Group: Medium
     * App Permission: Glip
     * User Permission: Glip
     */
    public GlipWebhookList get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipWebhookList.class);
    }

    /**
     * Creates a new webhook.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/groups/{groupId}/webhooks
     * Rate Limit Group: Medium
     * App Permission: Glip
     * User Permission: Glip
     */
    public GlipWebhookInfo post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipWebhookInfo.class);
    }
}
