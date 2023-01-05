package com.ringcentral.definitions;


public class GetInternalTextMessageInfoResponse
{
    /**
     * Internal identifier of a message
     * Format: int64
     */
    public Long id;
    public GetInternalTextMessageInfoResponse id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a message
     */
    public String uri;
    public GetInternalTextMessageInfoResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * The list of message attachments
     */
    public MessageAttachmentInfo[] attachments;
    public GetInternalTextMessageInfoResponse attachments(MessageAttachmentInfo[] attachments)
    {
        this.attachments = attachments;
        return this;
    }

    /**
     * Message availability status. Message in &#039;Deleted&#039; state is still preserved with all its attachments and can be restored. &#039;Purged&#039; means that all attachments are already deleted and the message itself is about to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    public GetInternalTextMessageInfoResponse availability(String availability)
    {
        this.availability = availability;
        return this;
    }

    /**
     * SMS and Pager only. Identifier of a conversation that the message belongs to
     * Format: int64
     */
    public Long conversationId;
    public GetInternalTextMessageInfoResponse conversationId(Long conversationId)
    {
        this.conversationId = conversationId;
        return this;
    }

    /**
     */
    public ConversationInfo conversation;
    public GetInternalTextMessageInfoResponse conversation(ConversationInfo conversation)
    {
        this.conversation = conversation;
        return this;
    }

    /**
     * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String creationTime;
    public GetInternalTextMessageInfoResponse creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Message direction. Note that for some message types not all directions are allowed. For example voicemail messages can be only inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    public GetInternalTextMessageInfoResponse direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     */
    public MessageStoreCallerInfoResponseFrom from;
    public GetInternalTextMessageInfoResponse from(MessageStoreCallerInfoResponseFrom from)
    {
        this.from = from;
        return this;
    }

    /**
     * The datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
    public GetInternalTextMessageInfoResponse lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Message status. Different message types may have different allowed status values. For outbound faxes the aggregated message status is returned: If status for at least one recipient is &#039;Queued&#039;, then &#039;Queued&#039; value is returned If status for at least one recipient is &#039;SendingFailed&#039;, then &#039;SendingFailed&#039; value is returned In other cases Sent status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    public GetInternalTextMessageInfoResponse messageStatus(String messageStatus)
    {
        this.messageStatus = messageStatus;
        return this;
    }

    /**
     * &#039;Pager&#039; only. &#039;True&#039; if at least one of the message recipients is &#039;Department&#039; extension
     */
    public Boolean pgToDepartment;
    public GetInternalTextMessageInfoResponse pgToDepartment(Boolean pgToDepartment)
    {
        this.pgToDepartment = pgToDepartment;
        return this;
    }

    /**
     * Message priority
     * Enum: Normal, High
     */
    public String priority;
    public GetInternalTextMessageInfoResponse priority(String priority)
    {
        this.priority = priority;
        return this;
    }

    /**
     * Message read status
     * Enum: Read, Unread
     */
    public String readStatus;
    public GetInternalTextMessageInfoResponse readStatus(String readStatus)
    {
        this.readStatus = readStatus;
        return this;
    }

    /**
     * Message subject. For SMS and Pager messages it replicates message text which is also returned as an attachment
     */
    public String subject;
    public GetInternalTextMessageInfoResponse subject(String subject)
    {
        this.subject = subject;
        return this;
    }

    /**
     * Recipient information
     */
    public MessageStoreCallerInfoResponseTo[] to;
    public GetInternalTextMessageInfoResponse to(MessageStoreCallerInfoResponseTo[] to)
    {
        this.to = to;
        return this;
    }

    /**
     * Message type
     * Enum: Fax, SMS, VoiceMail, Pager, Text
     */
    public String type;
    public GetInternalTextMessageInfoResponse type(String type)
    {
        this.type = type;
        return this;
    }
}