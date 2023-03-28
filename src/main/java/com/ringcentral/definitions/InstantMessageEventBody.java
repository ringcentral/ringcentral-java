package com.ringcentral.definitions;


/**
 * Notification payload body
 */
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
     *
     */
    public SenderInfo from;
    /**
     * Type of a message. The default value is &#039;SMS&#039;
     */
    public String type;
    /**
     * Message creation datetime in ISO 8601 format including timezone,
     * for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String creationTime;
    /**
     * Datetime when the message was modified in ISO 8601 format including
     * timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Message read status
     * Enum: Read, Unread
     */
    public String readStatus;
    /**
     * Message priority
     * Enum: Normal, High
     */
    public String priority;
    /**
     * Message attachment data
     */
    public MessageAttachmentInfo[] attachments;
    /**
     * Text message direction. Note that for some message types not all
     * directions are allowed. For example voicemail messages can
     * be only inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Message availability status. Message in &#039;Deleted&#039; state is still
     * preserved with all its attachments and can be restored. &#039;Purged&#039; means
     * that all attachments are already deleted and the message itself is about
     * to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * Message subject. It replicates message text which is also returned
     * as an attachment
     */
    public String subject;
    /**
     * Message status. Different message types may have different
     * allowed status values. For outbound faxes the aggregated message status
     * is returned. If, for outbound message, a status for at least one recipient is &#039;Queued&#039;, then
     * the &#039;Queued&#039; value is returned. If a status for at least one recipient is
     * &#039;SendingFailed&#039;, then the &#039;SendingFailed&#039; value is returned. In other cases
     * the &#039;Sent&#039; status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    /**
     * Deprecated. Identifier of a conversation the message belongs
     * to
     */
    public String conversationId;
    /**
     *
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
