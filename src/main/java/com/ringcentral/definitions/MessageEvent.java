package com.ringcentral.definitions;


public class MessageEvent {
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    /**
     * Event filter URI
     */
    public String event;
    /**
     * Datetime of sending a notification in [ISO 8601](shttps://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String timestamp;
    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    /**
     * Notification payload body
     */
    public MessageEventBody body;

    public MessageEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public MessageEvent event(String event) {
        this.event = event;
        return this;
    }

    public MessageEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public MessageEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public MessageEvent body(MessageEventBody body) {
        this.body = body;
        return this;
    }

}
