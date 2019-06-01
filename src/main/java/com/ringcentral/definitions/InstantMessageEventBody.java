package com.ringcentral.definitions;


public class InstantMessageEventBody {
    /**
     * Internal identifier of a message
     */
    public String id;
    /**
     * Message receiver(s) information
     */
    public NotificationRecipientInfo[] to;
    /**
     * Extension Type. For GCM transport type '_from' property should be used
     */
    public SenderInfo from;
    /**
     * Type of a message. The default value is 'SMS'
     */
    public String type;
    /**
     * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String creationTime;
    /**
     * Datetime when the message was modified in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String lastModifiedTime;
    /**
     * Status of a message
     * Default: Unread
     */
    public String readStatus;
    /**
     * Default: Normal
     */
    public String priority;
    /**
     * Message attachment data
     */
    public MessageAttachmentInfo[] attachments;
    /**
     * Message direction
     * Default: Inbound
     */
    public String direction;
    /**
     * Message availability status
     * Default: Alive
     */
    public String availability;
    /**
     * Message subject. It replicates message text which is also returned as an attachment
     */
    public String subject;
    /**
     * Status of a message
     * Default: Received
     */
    public String messageStatus;
    /**
     * Deprecated. Identifier of a conversation the message belongs to
     */
    public String conversationId;
    /**
     * Information about a conversation the message belongs to
     */
    public ConversationInfo conversation;
    /**
     * Internal identifier of a subscription owner extension
     */
    public String ownerId;

    public InstantMessageEventBody id(String id) {
        this.id = id;
        return this;
    }

    public InstantMessageEventBody to(NotificationRecipientInfo[] to) {
        this.to = to;
        return this;
    }

    public InstantMessageEventBody from(SenderInfo from) {
        this.from = from;
        return this;
    }

    public InstantMessageEventBody type(String type) {
        this.type = type;
        return this;
    }

    public InstantMessageEventBody creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public InstantMessageEventBody lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public InstantMessageEventBody readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public InstantMessageEventBody priority(String priority) {
        this.priority = priority;
        return this;
    }

    public InstantMessageEventBody attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public InstantMessageEventBody direction(String direction) {
        this.direction = direction;
        return this;
    }

    public InstantMessageEventBody availability(String availability) {
        this.availability = availability;
        return this;
    }

    public InstantMessageEventBody subject(String subject) {
        this.subject = subject;
        return this;
    }

    public InstantMessageEventBody messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public InstantMessageEventBody conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public InstantMessageEventBody conversation(ConversationInfo conversation) {
        this.conversation = conversation;
        return this;
    }

    public InstantMessageEventBody ownerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

}
