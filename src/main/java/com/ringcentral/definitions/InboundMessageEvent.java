package com.ringcentral.definitions;


public class InboundMessageEvent {
    /**
     * Information on a notification
     */
    public NotificationInfo aps;
    /**
     * Internal identifier of a message
     */
    public String messageId;
    /**
     * Internal identifier of an conversation
     */
    public String conversationId;
    /**
     * Sender phone number. For GCM transport type '_from' property should be used
     */
    public String from;
    /**
     * Receiver phone number
     */
    public String to;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public InboundMessageEvent aps(NotificationInfo aps) {
        this.aps = aps;
        return this;
    }

    public InboundMessageEvent messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public InboundMessageEvent conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public InboundMessageEvent from(String from) {
        this.from = from;
        return this;
    }

    public InboundMessageEvent to(String to) {
        this.to = to;
        return this;
    }

    public InboundMessageEvent ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
