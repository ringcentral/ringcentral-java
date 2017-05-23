package com.ringcentral.definitions;

public class InstantMessageEvent {
    // Internal identifier of a message
    public String id;
    // Message receiver(s) information
    public InstantMessageEvent_CallerInfo[] to;
    // Message sender information
    public InstantMessageEvent_CallerInfo from;
    // Type of a message. The default value is 'SMS'
    public String type;
    // Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    // The datetime when the message was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastModifiedTime;
    // Status of a message. The default value is 'Unread'
    public String readStatus;
    // The default value is 'Normal'
    public String priority;
    // Message attachment data
    public InstantMessageAttachmentInfo[] attachments;
    // Message direction. The default value is 'Inbound'
    public String direction;
    // Message availability status. The default value is 'Alive'
    public String availability;
    // Message subject. It replicates message text which is also returned as an attachment
    public String subject;
    // Status of a message. The default value is 'Received'
    public String messageStatus;
    // Identifier of the conversation the message belongs to
    public String conversationId;

    public InstantMessageEvent id(String id) {
        this.id = id;
        return this;
    }

    public InstantMessageEvent to(InstantMessageEvent_CallerInfo[] to) {
        this.to = to;
        return this;
    }

    public InstantMessageEvent from(InstantMessageEvent_CallerInfo from) {
        this.from = from;
        return this;
    }

    public InstantMessageEvent type(String type) {
        this.type = type;
        return this;
    }

    public InstantMessageEvent creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public InstantMessageEvent lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public InstantMessageEvent readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public InstantMessageEvent priority(String priority) {
        this.priority = priority;
        return this;
    }

    public InstantMessageEvent attachments(InstantMessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public InstantMessageEvent direction(String direction) {
        this.direction = direction;
        return this;
    }

    public InstantMessageEvent availability(String availability) {
        this.availability = availability;
        return this;
    }

    public InstantMessageEvent subject(String subject) {
        this.subject = subject;
        return this;
    }

    public InstantMessageEvent messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public InstantMessageEvent conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
}
