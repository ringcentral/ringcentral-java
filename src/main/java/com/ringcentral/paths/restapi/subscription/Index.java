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
     * This API allows client applications to register a new subscription so that it
     * can be notified of events when they occur on the platform.
     * <p>
     * A subscription relates to a set of events that a client application would like
     * to be informed of and the delivery channel by which they will be notified of
     * those events. How subscriptions are established depends upon the notification
     * channel the client application would like to use to receive the event
     * notification. For example, to create a webhook a developer would create a
     * subscription via a REST API call, while specifying a list of events or &quot;event
     * filters&quot; to be notified of, a transport type of `WebHook`, and the address or
     * URL to which they would like the webhook delivered.
     * <p>
     * However, developers wishing to subscribe to a set of events via a WebSocket
     * channel, would first connect to the WebSocket gateway, and then issue their
     * subscription request over the WebSocket itself, as opposed to making a REST
     * API call to this endpoint.
     * <p>
     * While the protocol for establishing a subscription may vary depending upon
     * the delivery channel for that subscription, the schemas used for representing
     * a subscription are the same across all delivery modes.
     * <p>
     * Subscriptions are currently limited to 30 subscriptions per user/extension (for particular application).
     * <p>
     * RingCentral currently supports the following delivery modes for event subscriptions:
     * <p>
     * * [WebHook](https://developers.ringcentral.com/guide/notifications/webhooks/quick-start) - to receive event notifications as an HTTP POST to a given URL
     * * [WebSocket](https://developers.ringcentral.com/guide/notifications/websockets/quick-start) - to receive real-time events over a persistent WebSocket connection
     * <p>
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
     * Updates the existing subscription. The client application can extend or narrow
     * the list of events for which it receives notifications within the current subscription.
     * If event filters are specified, calling this method modifies them for the
     * existing subscription. The method also allows one to set an expiration time for the
     * subscription itself.
     * <p>
     * If parameters other than `events` and `expiresIn` are specified in the request they will be ignored.
     * If the request body is empty then the specified subscription will be renewed without any
     * event filter modifications and using the default expiration time.
     * <p>
     * If the request is sent with empty body, it just renews a subscription
     * (so it is an equivalent of the `POST /restapi/v1.0/subscription/{subscriptionId}/renew`).
     * <p>
     * Please note that `WebSocket` subscriptions cannot be updated via HTTP interface.
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
