package com.ringcentral.definitions;


public class GetMessageInfoResponse
{
    /**
     * Internal identifier of a message
     * Format: int64
     */
    public Long id;
    public GetMessageInfoResponse id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of a message
     */
    public String uri;
    public GetMessageInfoResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    public GetMessageInfoResponse extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * The list of message attachments
     */
    public MessageAttachmentInfo[] attachments;
    public GetMessageInfoResponse attachments(MessageAttachmentInfo[] attachments)
    {
        this.attachments = attachments;
        return this;
    }

    /**
     * Message availability status. Message in &#039;Deleted&#039; state is still preserved with all its attachments and can be restored. &#039;Purged&#039; means that all attachments are already deleted and the message itself is about to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    public GetMessageInfoResponse availability(String availability)
    {
        this.availability = availability;
        return this;
    }

    /**
     * SMS and Pager only. Identifier of a conversation the message belongs to
     * Format: int64
     */
    public Long conversationId;
    public GetMessageInfoResponse conversationId(Long conversationId)
    {
        this.conversationId = conversationId;
        return this;
    }

    /**
     */
    public ConversationInfo conversation;
    public GetMessageInfoResponse conversation(ConversationInfo conversation)
    {
        this.conversation = conversation;
        return this;
    }

    /**
     * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String creationTime;
    public GetMessageInfoResponse creationTime(String creationTime)
    {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * SMS only. Delivery error code returned by gateway
     */
    public String deliveryErrorCode;
    public GetMessageInfoResponse deliveryErrorCode(String deliveryErrorCode)
    {
        this.deliveryErrorCode = deliveryErrorCode;
        return this;
    }

    /**
     * Message direction. Note that for some message types not all directions are allowed. For example voicemail messages can be only inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    public GetMessageInfoResponse direction(String direction)
    {
        this.direction = direction;
        return this;
    }

    /**
     * Fax only. Page count in a fax message
     */
    public Long faxPageCount;
    public GetMessageInfoResponse faxPageCount(Long faxPageCount)
    {
        this.faxPageCount = faxPageCount;
        return this;
    }

    /**
     * Fax only. Resolution of a fax message. &#039;High&#039; for black and white image scanned at 200 dpi, &#039;Low&#039; for black and white image scanned at 100 dpi
     * Enum: High, Low
     */
    public String faxResolution;
    public GetMessageInfoResponse faxResolution(String faxResolution)
    {
        this.faxResolution = faxResolution;
        return this;
    }

    /**
     */
    public MessageStoreCallerInfoResponseFrom from;
    public GetMessageInfoResponse from(MessageStoreCallerInfoResponseFrom from)
    {
        this.from = from;
        return this;
    }

    /**
     * The datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
    public GetMessageInfoResponse lastModifiedTime(String lastModifiedTime)
    {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Message status. Different message types may have different allowed status values. For outbound faxes the aggregated message status is returned: If status for at least one recipient is &#039;Queued&#039;, then &#039;Queued&#039; value is returned If status for at least one recipient is &#039;SendingFailed&#039;, then &#039;SendingFailed&#039; value is returned In other cases Sent status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    public GetMessageInfoResponse messageStatus(String messageStatus)
    {
        this.messageStatus = messageStatus;
        return this;
    }

    /**
     * &#039;Pager&#039; only. &#039;True&#039; if at least one of the message recipients is &#039;Department&#039; extension
     */
    public Boolean pgToDepartment;
    public GetMessageInfoResponse pgToDepartment(Boolean pgToDepartment)
    {
        this.pgToDepartment = pgToDepartment;
        return this;
    }

    /**
     * Message priority
     * Enum: Normal, High
     */
    public String priority;
    public GetMessageInfoResponse priority(String priority)
    {
        this.priority = priority;
        return this;
    }

    /**
     * Message read status
     * Enum: Read, Unread
     */
    public String readStatus;
    public GetMessageInfoResponse readStatus(String readStatus)
    {
        this.readStatus = readStatus;
        return this;
    }

    /**
     * SMS only. The datetime when outbound SMS was delivered to recipient&#039;s handset in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. It is filled only if the carrier sends a delivery receipt to RingCentral
     * Format: date-time
     */
    public String smsDeliveryTime;
    public GetMessageInfoResponse smsDeliveryTime(String smsDeliveryTime)
    {
        this.smsDeliveryTime = smsDeliveryTime;
        return this;
    }

    /**
     * SMS only. Number of attempts made to send an outbound SMS to the gateway (if gateway is temporary unavailable)
     */
    public Long smsSendingAttemptsCount;
    public GetMessageInfoResponse smsSendingAttemptsCount(Long smsSendingAttemptsCount)
    {
        this.smsSendingAttemptsCount = smsSendingAttemptsCount;
        return this;
    }

    /**
     * Message subject. For SMS and Pager messages it replicates message text which is also returned as an attachment
     */
    public String subject;
    public GetMessageInfoResponse subject(String subject)
    {
        this.subject = subject;
        return this;
    }

    /**
     * Recipient information
     */
    public MessageStoreCallerInfoResponseTo[] to;
    public GetMessageInfoResponse to(MessageStoreCallerInfoResponseTo[] to)
    {
        this.to = to;
        return this;
    }

    /**
     * Message type
     * Enum: Fax, SMS, VoiceMail, Pager, Text
     */
    public String type;
    public GetMessageInfoResponse type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Voicemail only. Status of voicemail to text transcription. If VoicemailToText feature is not activated for account, the &#039;NotAvailable&#039; value is returned
     * Enum: NotAvailable, InProgress, TimedOut, Completed, CompletedPartially, Failed, Unknown
     */
    public String vmTranscriptionStatus;
    public GetMessageInfoResponse vmTranscriptionStatus(String vmTranscriptionStatus)
    {
        this.vmTranscriptionStatus = vmTranscriptionStatus;
        return this;
    }

    /**
     * Cover page identifier. If coverIndex is set to &#039;0&#039; (zero) cover page is not attached. For the list of available cover page identifiers (1-13) please call the Fax Cover Pages method. If not specified, the default cover page is attached (which is configured in &#039;Outbound Fax Settings&#039;)
     */
    public Long coverIndex;
    public GetMessageInfoResponse coverIndex(Long coverIndex)
    {
        this.coverIndex = coverIndex;
        return this;
    }

    /**
     * Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
     */
    public String coverPageText;
    public GetMessageInfoResponse coverPageText(String coverPageText)
    {
        this.coverPageText = coverPageText;
        return this;
    }
}