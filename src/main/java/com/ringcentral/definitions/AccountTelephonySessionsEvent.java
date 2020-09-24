package com.ringcentral.definitions;


public class AccountTelephonySessionsEvent {
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
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    /**
     * Notification payload body
     */
    public TelephonySessionsEventBody body;

    public AccountTelephonySessionsEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public AccountTelephonySessionsEvent event(String event) {
        this.event = event;
        return this;
    }

    public AccountTelephonySessionsEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public AccountTelephonySessionsEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public AccountTelephonySessionsEvent ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public AccountTelephonySessionsEvent body(TelephonySessionsEventBody body) {
        this.body = body;
        return this;
    }

}
