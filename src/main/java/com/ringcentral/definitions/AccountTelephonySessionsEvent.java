package com.ringcentral.definitions;


public class AccountTelephonySessionsEvent
{
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    public AccountTelephonySessionsEvent uuid(String uuid)
    {
        this.uuid = uuid;
        return this;
    }

    /**
     * Event filter URI
     */
    public String event;
    public AccountTelephonySessionsEvent event(String event)
    {
        this.event = event;
        return this;
    }

    /**
     * Datetime of sending a notification in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String timestamp;
    public AccountTelephonySessionsEvent timestamp(String timestamp)
    {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    public AccountTelephonySessionsEvent subscriptionId(String subscriptionId)
    {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;
    public AccountTelephonySessionsEvent ownerId(String ownerId)
    {
        this.ownerId = ownerId;
        return this;
    }

    /**
     */
    public TelephonySessionsEventBody body;
    public AccountTelephonySessionsEvent body(TelephonySessionsEventBody body)
    {
        this.body = body;
        return this;
    }
}