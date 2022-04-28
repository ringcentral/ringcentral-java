package com.ringcentral.definitions;


public class GetInternalTextMessageInfoResponse {
    /**
     * Internal identifier of a message
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of a message
     */
    public String uri;
    /**
     * The list of message attachments
     */
    public MessageAttachmentInfo[] attachments;
    /**
     * Message availability status. Message in &#039;Deleted&#039; state is still preserved with all its attachments and can be restored. &#039;Purged&#039; means that all attachments are already deleted and the message itself is about to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * SMS and Pager only. Identifier of a conversation that the message belongs to
     * Format: int64
     */
    public Long conversationId;
    /**
     *
     */
    public ConversationInfo conversation;
    /**
     * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String creationTime;
    /**
     * Message direction. Note that for some message types not all directions are allowed. For example voicemail messages can be only inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     *
     */
    public MessageStoreCallerInfoResponseFrom from;
    /**
     * The datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
    /**
     * Message status. Different message types may have different allowed status values. For outbound faxes the aggregated message status is returned: If status for at least one recipient is &#039;Queued&#039;, then &#039;Queued&#039; value is returned If status for at least one recipient is &#039;SendingFailed&#039;, then &#039;SendingFailed&#039; value is returned In other cases Sent status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    /**
     * &#039;Pager&#039; only. &#039;True&#039; if at least one of the message recipients is &#039;Department&#039; extension
     */
    public Boolean pgToDepartment;
    /**
     * Message priority
     * Enum: Normal, High
     */
    public String priority;
    /**
     * Message read status
     * Enum: Read, Unread
     */
    public String readStatus;
    /**
     * Message subject. For SMS and Pager messages it replicates message text which is also returned as an attachment
     */
    public String subject;
    /**
     * Recipient information
     */
    public MessageStoreCallerInfoResponseTo[] to;
    /**
     * Message type
     * Enum: Fax, SMS, VoiceMail, Pager, Text
     */
    public String type;

    public GetInternalTextMessageInfoResponse id(Long id) {
        this.id = id;
        return this;
    }

    public GetInternalTextMessageInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetInternalTextMessageInfoResponse attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public GetInternalTextMessageInfoResponse availability(String availability) {
        this.availability = availability;
        return this;
    }

    public GetInternalTextMessageInfoResponse conversationId(Long conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public GetInternalTextMessageInfoResponse conversation(ConversationInfo conversation) {
        this.conversation = conversation;
        return this;
    }

    public GetInternalTextMessageInfoResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GetInternalTextMessageInfoResponse direction(String direction) {
        this.direction = direction;
        return this;
    }

    public GetInternalTextMessageInfoResponse from(MessageStoreCallerInfoResponseFrom from) {
        this.from = from;
        return this;
    }

    public GetInternalTextMessageInfoResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GetInternalTextMessageInfoResponse messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public GetInternalTextMessageInfoResponse pgToDepartment(Boolean pgToDepartment) {
        this.pgToDepartment = pgToDepartment;
        return this;
    }

    public GetInternalTextMessageInfoResponse priority(String priority) {
        this.priority = priority;
        return this;
    }

    public GetInternalTextMessageInfoResponse readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public GetInternalTextMessageInfoResponse subject(String subject) {
        this.subject = subject;
        return this;
    }

    public GetInternalTextMessageInfoResponse to(MessageStoreCallerInfoResponseTo[] to) {
        this.to = to;
        return this;
    }

    public GetInternalTextMessageInfoResponse type(String type) {
        this.type = type;
        return this;
    }
}
