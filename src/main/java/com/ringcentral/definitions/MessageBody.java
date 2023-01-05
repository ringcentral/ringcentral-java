package com.ringcentral.definitions;


public class MessageBody
{
    /**
     * Canonical URI of a message
     */
    public String uri;
    public MessageBody uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a message
     */
    public String id;
    public MessageBody id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * The list of message attachments
     */
    public MessageAttachmentInfo[] attachments;
    public MessageBody attachments(MessageAttachmentInfo[] attachments)
    {
        this.attachments = attachments;
        return this;
    }

    /**
     * Message availability status. Message in &#039;Deleted&#039; state is still preserved with all its attachments and can be restored. &#039;Purged&#039; means that all attachments are already deleted and the message itself is about to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    public MessageBody availability(String availability)
    {
        this.availability = availability;
        return this;
    }

    /**
     * SMS and Pager only. Identifier of a conversation the message belongs to
     * Format: int64
     */
    public Long conversationId;
    public MessageBody conversationId(Long conversationId)
    {
        this.conversationId = conversationId;
        return this;
    }

    /**
     */
    public ConversationInfo conversation;
    public MessageBody conversation(ConversationInfo conversation)
    {
        this.conversation = conversation;
        return this;
    }

    /**
     * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String creationTime;
    public MessageBody creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * SMS only. Delivery error code returned by gateway
     */
    public String deliveryErrorCode;
    public MessageBody deliveryErrorCode(String deliveryErrorCode)
    {
        this.deliveryErrorCode = deliveryErrorCode;
        return this;
    }

    /**
     * Message direction. Note that for some message types not all directions are allowed. For example voicemail messages can be only inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    public MessageBody direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * Fax only. Page count in a fax message
     */
    public Long faxPageCount;
    public MessageBody faxPageCount(Long faxPageCount)
    {
        this.faxPageCount = faxPageCount;
        return this;
    }

    /**
     * Fax only. Resolution of a fax message. &#039;High&#039; for black and white image scanned at 200 dpi, &#039;Low&#039; for black and white image scanned at 100 dpi
     * Enum: High, Low
     */
    public String faxResolution;
    public MessageBody faxResolution(String faxResolution)
    {
        this.faxResolution = faxResolution;
        return this;
    }

    /**
     */
    public MessageSenderInfo from;
    public MessageBody from(MessageSenderInfo from)
    {
        this.from = from;
        return this;
    }

    /**
     * The datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
    public MessageBody lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Message status. Different message types may have different allowed status values.For outbound faxes the aggregated message status is returned: If status for at least one recipient is &#039;Queued&#039;, then &#039;Queued&#039; value is returned If status for at least one recipient is &#039;SendingFailed&#039;, then &#039;SendingFailed&#039; value is returned In other cases Sent status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    public MessageBody messageStatus(String messageStatus)
    {
        this.messageStatus = messageStatus;
        return this;
    }

    /**
     * &#039;Pager&#039; only. &#039;True&#039; if at least one of the message recipients is &#039;Department&#039; extension
     */
    public Boolean pgToDepartment;
    public MessageBody pgToDepartment(Boolean pgToDepartment)
    {
        this.pgToDepartment = pgToDepartment;
        return this;
    }

    /**
     * Message priority
     * Enum: Normal, High
     */
    public String priority;
    public MessageBody priority(String priority)
    {
        this.priority = priority;
        return this;
    }

    /**
     * Message read status
     * Enum: Read, Unread
     */
    public String readStatus;
    public MessageBody readStatus(String readStatus)
    {
        this.readStatus = readStatus;
        return this;
    }

    /**
     * SMS only. The datetime when outbound SMS was delivered to recipient&#039;s handset in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. It is filled only if the carrier sends a delivery receipt to RingCentral
     * Format: date-time
     */
    public String smsDeliveryTime;
    public MessageBody smsDeliveryTime(String smsDeliveryTime)
    {
        this.smsDeliveryTime = smsDeliveryTime;
        return this;
    }

    /**
     * SMS only. Number of attempts made to send an outbound SMS to the gateway (if gateway is temporary unavailable)
     */
    public Long smsSendingAttemptsCount;
    public MessageBody smsSendingAttemptsCount(Long smsSendingAttemptsCount)
    {
        this.smsSendingAttemptsCount = smsSendingAttemptsCount;
        return this;
    }

    /**
     * Message subject. For SMS and Pager messages it replicates message text which is also returned as an attachment
     */
    public String subject;
    public MessageBody subject(String subject)
    {
        this.subject = subject;
        return this;
    }

    /**
     * Recipient information
     */
    public MessageRecipientInfo[] to;
    public MessageBody to(MessageRecipientInfo[] to)
    {
        this.to = to;
        return this;
    }

    /**
     * Message type
     * Enum: Fax, SMS, VoiceMail, Pager, Text
     */
    public String type;
    public MessageBody type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Voicemail only. Status of voicemail to text transcription. If VoicemailToText feature is not activated for account, the &#039;NotAvailable&#039; value is returned
     * Enum: NotAvailable, InProgress, TimedOut, Completed, CompletedPartially, Failed
     */
    public String vmTranscriptionStatus;
    public MessageBody vmTranscriptionStatus(String vmTranscriptionStatus)
    {
        this.vmTranscriptionStatus = vmTranscriptionStatus;
        return this;
    }
}