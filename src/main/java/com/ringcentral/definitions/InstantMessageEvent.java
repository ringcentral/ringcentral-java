package com.ringcentral.definitions;


public class InstantMessageEvent {
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    /**
     * Event filter URI
     */
    public String event;
    /**
     * Date/time of sending a notification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String timestamp;
    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    /**
     *
     */
    public InstantMessageEventBody body;

    public InstantMessageEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public InstantMessageEvent event(String event) {
        this.event = event;
        return this;
    }

    public InstantMessageEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public InstantMessageEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public InstantMessageEvent body(InstantMessageEventBody body) {
        this.body = body;
        return this;
    }
}
