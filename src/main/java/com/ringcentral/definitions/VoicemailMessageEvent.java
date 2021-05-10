package com.ringcentral.definitions;


public class VoicemailMessageEvent {
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
     *
     */
    public VoicemailMessageEventBody body;

    public VoicemailMessageEvent uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public VoicemailMessageEvent event(String event) {
        this.event = event;
        return this;
    }

    public VoicemailMessageEvent timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public VoicemailMessageEvent subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public VoicemailMessageEvent ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public VoicemailMessageEvent body(VoicemailMessageEventBody body) {
        this.body = body;
        return this;
    }
}
