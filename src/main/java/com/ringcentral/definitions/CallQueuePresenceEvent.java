package com.ringcentral.definitions;


public class CallQueuePresenceEvent
{
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    public CallQueuePresenceEvent uuid(String uuid)
    {
        this.uuid = uuid;
        return this;
    }

    /**
     * Event filter name
     */
    public String event;
    public CallQueuePresenceEvent event(String event)
    {
        this.event = event;
        return this;
    }

    /**
     * Timestamp when this notification was sent in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String timestamp;
    public CallQueuePresenceEvent timestamp(String timestamp)
    {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    public CallQueuePresenceEvent subscriptionId(String subscriptionId)
    {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     */
    public CallQueuePresenceEventBody body;
    public CallQueuePresenceEvent body(CallQueuePresenceEventBody body)
    {
        this.body = body;
        return this;
    }
}