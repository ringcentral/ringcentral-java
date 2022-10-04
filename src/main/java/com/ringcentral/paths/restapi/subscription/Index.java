package com.ringcentral.paths.restapi.subscription;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateSubscriptionRequest;
import com.ringcentral.definitions.SubscriptionInfo;
import com.ringcentral.definitions.SubscriptionListResource;
import com.ringcentral.definitions.UpdateSubscriptionRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.Index parent;
    public String subscriptionId;

    public Index(com.ringcentral.paths.restapi.Index parent, String subscriptionId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.subscriptionId = subscriptionId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && subscriptionId != null) {
            return parent.path() + "/subscription/" + subscriptionId;
        }
        return parent.path() + "/subscription";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a list of subscriptions created by the user for the current authorized client application.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/subscription
     * Rate Limit Group: Light
     */
    public SubscriptionListResource list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionListResource.class);
    }

    /**
     * Creates a new subscription for the current authorized user / client application.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/subscription
     * Rate Limit Group: Medium
     */
    public SubscriptionInfo post(CreateSubscriptionRequest createSubscriptionRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createSubscriptionRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), SubscriptionInfo.class);
    }

    /**
     * Returns the existing subscription by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/subscription/{subscriptionId}
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
     * existing subscription. The method also allows to set the subscription expiration time.
     * If other than `events` and `expiresIn` parameters are passed in the request they will be ignored.
     * If the request body is empty then the specified subscription will be just renewed without any
     * event filter modifications and with default expiration time.
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/subscription/{subscriptionId}
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
     * Cancels the existing subscription.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/subscription/{subscriptionId}
     * Rate Limit Group: Medium
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (subscriptionId == null) {
            throw new IllegalArgumentException("Parameter subscriptionId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    public com.ringcentral.paths.restapi.subscription.renew.Index renew() {
        return new com.ringcentral.paths.restapi.subscription.renew.Index(this);
    }

}
