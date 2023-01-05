package com.ringcentral.definitions;


public class DetailedExtensionPresenceWithSIPEvent
{
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    public DetailedExtensionPresenceWithSIPEvent uuid(String uuid)
    {
        this.uuid = uuid;
        return this;
    }

    /**
     * Event filter name
     */
    public String event;
    public DetailedExtensionPresenceWithSIPEvent event(String event)
    {
        this.event = event;
        return this;
    }

    /**
     * Timestamp when this notification was sent in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String timestamp;
    public DetailedExtensionPresenceWithSIPEvent timestamp(String timestamp)
    {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    public DetailedExtensionPresenceWithSIPEvent subscriptionId(String subscriptionId)
    {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     */
    public DetailedExtensionPresenceWithSIPEventBody body;
    public DetailedExtensionPresenceWithSIPEvent body(DetailedExtensionPresenceWithSIPEventBody body)
    {
        this.body = body;
        return this;
    }
}