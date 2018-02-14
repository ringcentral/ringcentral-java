package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class InboundMessageEvent
{
    // Information on a notification
    public NotificationInfo aps;
    public InboundMessageEvent aps(NotificationInfo aps) {
        this.aps = aps;
        return this;
    }
    // Internal identifier of an message
    public String messageId;
    public InboundMessageEvent messageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    // Internal identifier of an conversation
    public String conversationId;
    public InboundMessageEvent conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    // Sender phone number
    public String from;
    public InboundMessageEvent from(String from) {
        this.from = from;
        return this;
    }
    // Receiver phone number
    public String to;
    public InboundMessageEvent to(String to) {
        this.to = to;
        return this;
    }
}
