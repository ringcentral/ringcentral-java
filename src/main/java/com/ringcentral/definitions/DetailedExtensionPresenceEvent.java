package com.ringcentral.definitions;


public class DetailedExtensionPresenceEvent {
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
    public DetailedExtensionPresenceEventBody body;

    public DetailedExtensionPresenceEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public DetailedExtensionPresenceEvent event(String event) {
        this.event = event;
        return this;
    }

    public DetailedExtensionPresenceEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public DetailedExtensionPresenceEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public DetailedExtensionPresenceEvent body(DetailedExtensionPresenceEventBody body) {
        this.body = body;
        return this;
    }

}
