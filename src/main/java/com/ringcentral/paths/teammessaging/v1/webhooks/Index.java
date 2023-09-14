package com.ringcentral.paths.teammessaging.v1.webhooks;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.v1.Index parent;
    public String webhookId;

    public Index(com.ringcentral.paths.teammessaging.v1.Index parent, String webhookId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.webhookId = webhookId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && webhookId != null) {
            return parent.path() + "/webhooks/" + webhookId;
        }
        return parent.path() + "/webhooks";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of all webhooks associated with the current account.
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/webhooks
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMWebhookList list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMWebhookList.class);
    }

    /**
     * Returns webhooks(s) with the specified id(s).
     * HTTP Method: get
     * Endpoint: /team-messaging/v1/webhooks/{webhookId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMWebhookList get() throws com.ringcentral.RestException, java.io.IOException {
        if (webhookId == null) {
            throw new IllegalArgumentException("Parameter webhookId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMWebhookList.class);
    }

    /**
     * Deletes a webhook by ID.
     * HTTP Method: delete
     * Endpoint: /team-messaging/v1/webhooks/{webhookId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (webhookId == null) {
            throw new IllegalArgumentException("Parameter webhookId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    public com.ringcentral.paths.teammessaging.v1.webhooks.suspend.Index suspend() {
        return new com.ringcentral.paths.teammessaging.v1.webhooks.suspend.Index(this);
    }


    public com.ringcentral.paths.teammessaging.v1.webhooks.activate.Index activate() {
        return new com.ringcentral.paths.teammessaging.v1.webhooks.activate.Index(this);
    }

}
