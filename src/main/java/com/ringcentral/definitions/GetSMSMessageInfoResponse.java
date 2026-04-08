package com.ringcentral.definitions;


public class GetSMSMessageInfoResponse
{
    /**
     * Internal identifier of a message
     * Format: int64
     */
    public Long id;
    public GetSMSMessageInfoResponse id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a message
     * Format: uri
     */
    public String uri;
    public GetSMSMessageInfoResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of message attachments
     */
    public MessageAttachmentInfo[] attachments;
    public GetSMSMessageInfoResponse attachments(MessageAttachmentInfo[] attachments)
    {
        this.attachments = attachments;
        return this;
    }

    /**
     * Message availability status. Message in `Deleted` state is still
    * preserved with all its attachments and can be restored. `Purged` means
    * that all attachments are already deleted and the message itself is about
    * to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    public GetSMSMessageInfoResponse availability(String availability)
    {
        this.availability = availability;
        return this;
    }

    /**
     * SMS and Pager only. Identifier of a conversation that the message
    * belongs to
     * Format: int64
     */
    public Long conversationId;
    public GetSMSMessageInfoResponse conversationId(Long conversationId)
    {
        this.conversationId = conversationId;
        return this;
    }

    /**
     */
    public ConversationInfo conversation;
    public GetSMSMessageInfoResponse conversation(ConversationInfo conversation)
    {
        this.conversation = conversation;
        return this;
    }

    /**
     * Message creation date/time in ISO 8601 format including timezone,
    * for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String creationTime;
    public GetSMSMessageInfoResponse creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Message direction (inbound or outbound)
     * Enum: Inbound, Outbound
     */
    public String direction;
    public GetSMSMessageInfoResponse direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     */
    public MessageStoreCallerInfoResponseFrom from;
    public GetSMSMessageInfoResponse from(MessageStoreCallerInfoResponseFrom from)
    {
        this.from = from;
        return this;
    }

    /**
     * Date/time when the message was modified on server in ISO
    * 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
    public GetSMSMessageInfoResponse lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Message status. Different message types may have different
    * allowed status values. For outbound faxes the aggregated message status
    * is returned. If, for multi-recipient outbound message, a status for
    * at least one recipient is `Queued`, then the `Queued` value is returned.
    * If a status for at least one recipient is `SendingFailed`,
    * then the &#039;SendingFailed&#039; value is returned. In other cases,
    * the `Sent` status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    public GetSMSMessageInfoResponse messageStatus(String messageStatus)
    {
        this.messageStatus = messageStatus;
        return this;
    }

    /**
     * Message priority
     * Enum: Normal, High
     */
    public String priority;
    public GetSMSMessageInfoResponse priority(String priority)
    {
        this.priority = priority;
        return this;
    }

    /**
     * Message read status
     * Enum: Read, Unread
     */
    public String readStatus;
    public GetSMSMessageInfoResponse readStatus(String readStatus)
    {
        this.readStatus = readStatus;
        return this;
    }

    /**
     * SMS only. The date/time when outbound SMS was delivered to
    * recipient&#039;s handset in ISO 8601 format including timezone,
    * for example 2016-03-10T18:07:52.534Z. It is filled only if
    * the carrier sends a delivery receipt to RingCentral
     * Format: date-time
     */
    public String smsDeliveryTime;
    public GetSMSMessageInfoResponse smsDeliveryTime(String smsDeliveryTime)
    {
        this.smsDeliveryTime = smsDeliveryTime;
        return this;
    }

    /**
     * SMS only. Number of attempts made to send an outbound SMS to
    * the Gateway (if Gateway is temporary unavailable)
     * Format: int32
     */
    public Long smsSendingAttemptsCount;
    public GetSMSMessageInfoResponse smsSendingAttemptsCount(Long smsSendingAttemptsCount)
    {
        this.smsSendingAttemptsCount = smsSendingAttemptsCount;
        return this;
    }

    /**
     * Message subject. For SMS and Pager messages it replicates message
    * text which is also returned as an attachment
     */
    public String subject;
    public GetSMSMessageInfoResponse subject(String subject)
    {
        this.subject = subject;
        return this;
    }

    /**
     * Recipient information
     */
    public MessageStoreCallerInfoResponseTo[] to;
    public GetSMSMessageInfoResponse to(MessageStoreCallerInfoResponseTo[] to)
    {
        this.to = to;
        return this;
    }

    /**
     * Message type
     * Enum: Fax, SMS, VoiceMail, Pager, Text
     */
    public String type;
    public GetSMSMessageInfoResponse type(String type)
    {
        this.type = type;
        return this;
    }
}