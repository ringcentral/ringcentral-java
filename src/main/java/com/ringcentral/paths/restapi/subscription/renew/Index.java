package com.ringcentral.paths.restapi.subscription.renew;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SubscriptionInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.subscription.Index parent;

    public Index(com.ringcentral.paths.restapi.subscription.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/renew";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Renews the existing subscription (this request comes with empty body).
     * <p>
     * Please note that `WebSocket` subscriptions are renewed automatically while websocket session is alive.
     * <p>
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/subscription/{subscriptionId}/renew
     * Rate Limit Group: Light
     */
    public SubscriptionInfo post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionInfo.class);
    }
}
