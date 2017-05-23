package com.ringcentral.definitions;

public class DetailedPresenceWithSIPNotification {
    // Universally unique identifier of a notification
    public String uuid;
    // Event filter URI
    public String event;
    // Internal identifier of a subscription
    public String subscriptionId;
    // The datetime of sending a notification in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String timestamp;
    // Notification payload body
    public DetailedPresencewithSIPEvent body;

    public DetailedPresenceWithSIPNotification uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public DetailedPresenceWithSIPNotification event(String event) {
        this.event = event;
        return this;
    }

    public DetailedPresenceWithSIPNotification subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public DetailedPresenceWithSIPNotification timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public DetailedPresenceWithSIPNotification body(DetailedPresencewithSIPEvent body) {
        this.body = body;
        return this;
    }
}
