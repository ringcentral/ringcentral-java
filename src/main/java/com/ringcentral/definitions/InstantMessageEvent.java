package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class InstantMessageEvent
{
    // Internal identifier of an message
    public String id;
    public InstantMessageEvent id(String id) {
        this.id = id;
        return this;
    }
    // Message receiver(s) information
    public NotificationRecipientInfo[] to;
    public InstantMessageEvent to(NotificationRecipientInfo[] to) {
        this.to = to;
        return this;
    }
    // Extension Type
    public SenderInfo from;
    public InstantMessageEvent from(SenderInfo from) {
        this.from = from;
        return this;
    }
    // Type of a message. The default value is 'SMS'
    public String type;
    public InstantMessageEvent type(String type) {
        this.type = type;
        return this;
    }
    // Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    public InstantMessageEvent creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }
    // Datetime when the message was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastModifiedTime;
    public InstantMessageEvent lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    // Status of a message. The default value is 'Unread'
    public String readStatus;
    public InstantMessageEvent readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }
    // The default value is 'Normal'
    public String priority;
    public InstantMessageEvent priority(String priority) {
        this.priority = priority;
        return this;
    }
    // Message attachment data
    public MessageAttachmentInfo[] attachments;
    public InstantMessageEvent attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }
    // Message direction. The default value is 'Inbound'
    public String direction;
    public InstantMessageEvent direction(String direction) {
        this.direction = direction;
        return this;
    }
    // Message availability status. The default value is 'Alive'
    public String availability;
    public InstantMessageEvent availability(String availability) {
        this.availability = availability;
        return this;
    }
    // Message subject. It replicates message text which is also returned as an attachment
    public String subject;
    public InstantMessageEvent subject(String subject) {
        this.subject = subject;
        return this;
    }
    // Status of a message. The default value is 'Received'
    public String messageStatus;
    public InstantMessageEvent messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }
    // Identifier of the conversation the message belongs to
    public String conversationId;
    public InstantMessageEvent conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
}
