package com.ringcentral.paths.webinar.notifications.v1.subscriptions;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.webinar.notifications.v1.Index parent;
    public String subscriptionId;

    public Index(com.ringcentral.paths.webinar.notifications.v1.Index parent, String subscriptionId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.subscriptionId = subscriptionId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && subscriptionId != null) {
            return parent.path() + "/subscriptions/" + subscriptionId;
        }
        return parent.path() + "/subscriptions";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of webinar subscriptions created by the user for the current authorized client application.
     * HTTP Method: get
     * Endpoint: /webinar/notifications/v1/subscriptions
     * Rate Limit Group: Light
     */
    public SubscriptionListResource list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionListResource.class);
    }

    /**
     * Creates a new webinar subscription for the current authorized user / client application.
     * HTTP Method: post
     * Endpoint: /webinar/notifications/v1/subscriptions
     * Rate Limit Group: Medium
     */
    public SubscriptionInfo post(CreateWebhookSubscriptionRequest createWebhookSubscriptionRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createWebhookSubscriptionRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionInfo.class);
    }

    /**
     * Returns the webinar subscription by ID
     * HTTP Method: get
     * Endpoint: /webinar/notifications/v1/subscriptions/{subscriptionId}
     * Rate Limit Group: Light
     */
    public SubscriptionInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionInfo.class);
    }

    /**
     * Updates the existing subscription. The client application can extend/narrow
     * the list of events for which it receives notifications within this subscription.
     * If event filters are specified, calling this method modifies them for the
     * existing subscription. The method also allows setting the subscription expiration time.
     * If other than `events` and `expiresIn` parameters are passed in the request they will be ignored.
     * If the request body is empty then the specified subscription will be just renewed without any
     * event filter modifications and with default expiration time.
     * <p>
     * HTTP Method: put
     * Endpoint: /webinar/notifications/v1/subscriptions/{subscriptionId}
     * Rate Limit Group: Medium
     */
    public SubscriptionInfo put(UpdateSubscriptionRequest updateSubscriptionRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.put(this.path(), updateSubscriptionRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionInfo.class);
    }

    /**
     * Cancels the existing webinar subscription.
     * HTTP Method: delete
     * Endpoint: /webinar/notifications/v1/subscriptions/{subscriptionId}
     * Rate Limit Group: Medium
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    public com.ringcentral.paths.webinar.notifications.v1.subscriptions.renew.Index renew() {
        return new com.ringcentral.paths.webinar.notifications.v1.subscriptions.renew.Index(this);
    }

}
