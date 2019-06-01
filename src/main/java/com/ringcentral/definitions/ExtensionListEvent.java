package com.ringcentral.definitions;


public class ExtensionListEvent {
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
    public ExtensionListEventBody body;

    public ExtensionListEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public ExtensionListEvent event(String event) {
        this.event = event;
        return this;
    }

    public ExtensionListEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public ExtensionListEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public ExtensionListEvent body(ExtensionListEventBody body) {
        this.body = body;
        return this;
    }

}
