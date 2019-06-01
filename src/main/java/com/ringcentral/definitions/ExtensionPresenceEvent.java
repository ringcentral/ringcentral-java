package com.ringcentral.definitions;


public class ExtensionPresenceEvent {
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    /**
     * Event filter URI
     */
    public String event;
    /**
     * Datetime of sending a notification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String timestamp;
    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    /**
     * Notification payload body
     */
    public ExtensionPresenceEventBody body;

    public ExtensionPresenceEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public ExtensionPresenceEvent event(String event) {
        this.event = event;
        return this;
    }

    public ExtensionPresenceEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public ExtensionPresenceEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public ExtensionPresenceEvent body(ExtensionPresenceEventBody body) {
        this.body = body;
        return this;
    }

}
