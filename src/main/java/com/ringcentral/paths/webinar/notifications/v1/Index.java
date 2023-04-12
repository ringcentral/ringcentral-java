package com.ringcentral.paths.webinar.notifications.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.notifications.Index parent;

    public Index(com.ringcentral.paths.webinar.notifications.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/v1";
    }


    public com.ringcentral.paths.webinar.notifications.v1.subscriptions.Index subscriptions() {
        return this.subscriptions(null);
    }

    public com.ringcentral.paths.webinar.notifications.v1.subscriptions.Index subscriptions(String subscriptionId) {
        return new com.ringcentral.paths.webinar.notifications.v1.subscriptions.Index(this, subscriptionId);
    }

}
