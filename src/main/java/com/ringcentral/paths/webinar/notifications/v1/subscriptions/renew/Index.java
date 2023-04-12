package com.ringcentral.paths.webinar.notifications.v1.subscriptions.renew;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.SubscriptionInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.notifications.v1.subscriptions.Index parent;

    public Index(com.ringcentral.paths.webinar.notifications.v1.subscriptions.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/renew";
    }

    /**
     * Renews the existing webinar subscription.
     * HTTP Method: post
     * Endpoint: /webinar/notifications/v1/subscriptions/{subscriptionId}/renew
     * Rate Limit Group: Light
     */
    public SubscriptionInfo post() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionInfo.class);
    }
}
