package com.ringcentral.definitions;


public class AccountPresenceEvent {
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    /**
     * Event filter name
     */
    public String event;
    /**
     * Timestamp when this notification was sent in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String timestamp;
    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    /**
     *
     */
    public AccountPresenceEventBody body;

    public AccountPresenceEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public AccountPresenceEvent event(String event) {
        this.event = event;
        return this;
    }

    public AccountPresenceEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public AccountPresenceEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public AccountPresenceEvent body(AccountPresenceEventBody body) {
        this.body = body;
        return this;
    }
}
