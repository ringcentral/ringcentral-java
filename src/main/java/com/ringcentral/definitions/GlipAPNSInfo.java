package com.ringcentral.definitions;


// Apple notification data
public class GlipAPNSInfo {
    /**
     *
     */
    public GlipAPSInfo aps;
    /**
     * Datetime of a call action in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String timestamp;
    /**
     * Universally unique identifier of a notification
     */
    public String uuid;
    /**
     * Event filter URI
     */
    public String event;
    /**
     * Internal identifier of a subscription
     */
    public String subscriptionId;
    /**
     *
     */
    public GlipUnreadMessageCountInfo body;

    public GlipAPNSInfo aps(GlipAPSInfo aps) {
        this.aps = aps;
        return this;
    }

    public GlipAPNSInfo timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public GlipAPNSInfo uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public GlipAPNSInfo event(String event) {
        this.event = event;
        return this;
    }

    public GlipAPNSInfo subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public GlipAPNSInfo body(GlipUnreadMessageCountInfo body) {
        this.body = body;
        return this;
    }
}
