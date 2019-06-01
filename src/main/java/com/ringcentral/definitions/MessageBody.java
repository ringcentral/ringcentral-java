package com.ringcentral.definitions;


public class MessageBody {
    /**
     * Canonical URI of a message
     */
    public String uri;
    /**
     * Internal identifier of a message
     */
    public String id;
    /**
     * The list of message attachments
     */
    public MessageAttachmentInfo[] attachments;
    /**
     * Message availability status. Message in 'Deleted' state is still preserved with all its attachments and can be restored. 'Purged' means that all attachments are already deleted and the message itself is about to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * SMS and Pager only. Identifier of a conversation the message belongs to
     */
    public Long conversationId;
    /**
     * SMS and Pager only. Identifier of a conversation the message belongs to
     */
    public ConversationInfo conversation;
    /**
     * Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String creationTime;
    /**
     * SMS only. Delivery error code returned by gateway
     */
    public String deliveryErrorCode;
    /**
     * Message direction. Note that for some message types not all directions are allowed. For example voicemail messages can be only inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Fax only. Page count in a fax message
     */
    public Long faxPageCount;
    /**
     * Fax only. Resolution of a fax message. 'High' for black and white image scanned at 200 dpi, 'Low' for black and white image scanned at 100 dpi
     * Enum: High, Low
     */
    public String faxResolution;
    /**
     * Sender information
     */
    public MessageSenderInfo from;
    /**
     * The datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String lastModifiedTime;
    /**
     * Message status. Different message types may have different allowed status values.For outbound faxes the aggregated message status is returned: If status for at least one recipient is 'Queued', then 'Queued' value is returned If status for at least one recipient is 'SendingFailed', then 'SendingFailed' value is returned In other cases Sent status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
    /**
     * 'Pager' only. 'True' if at least one of the message recipients is 'Department' extension
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
     * SMS only. The datetime when outbound SMS was delivered to recipient's handset in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. It is filled only if the carrier sends a delivery receipt to RingCentral
     */
    public String smsDeliveryTime;
    /**
     * SMS only. Number of attempts made to send an outbound SMS to the gateway (if gateway is temporary unavailable)
     */
    public Long smsSendingAttemptsCount;
    /**
     * Message subject. For SMS and Pager messages it replicates message text which is also returned as an attachment
     */
    public String subject;
    /**
     * Recipient information
     */
    public MessageRecipientInfo[] to;
    /**
     * Message type
     * Enum: Fax, SMS, VoiceMail, Pager, Text
     */
    public String type;
    /**
     * Voicemail only. Status of voicemail to text transcription. If VoicemailToText feature is not activated for account, the 'NotAvailable' value is returned
     * Enum: NotAvailable, InProgress, TimedOut, Completed, CompletedPartially, Failed
     */
    public String vmTranscriptionStatus;

    public MessageBody uri(String uri) {
        this.uri = uri;
        return this;
    }

    public MessageBody id(String id) {
        this.id = id;
        return this;
    }

    public MessageBody attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public MessageBody availability(String availability) {
        this.availability = availability;
        return this;
    }

    public MessageBody conversationId(Long conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public MessageBody conversation(ConversationInfo conversation) {
        this.conversation = conversation;
        return this;
    }

    public MessageBody creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public MessageBody deliveryErrorCode(String deliveryErrorCode) {
        this.deliveryErrorCode = deliveryErrorCode;
        return this;
    }

    public MessageBody direction(String direction) {
        this.direction = direction;
        return this;
    }

    public MessageBody faxPageCount(Long faxPageCount) {
        this.faxPageCount = faxPageCount;
        return this;
    }

    public MessageBody faxResolution(String faxResolution) {
        this.faxResolution = faxResolution;
        return this;
    }

    public MessageBody from(MessageSenderInfo from) {
        this.from = from;
        return this;
    }

    public MessageBody lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public MessageBody messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public MessageBody pgToDepartment(Boolean pgToDepartment) {
        this.pgToDepartment = pgToDepartment;
        return this;
    }

    public MessageBody priority(String priority) {
        this.priority = priority;
        return this;
    }

    public MessageBody readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public MessageBody smsDeliveryTime(String smsDeliveryTime) {
        this.smsDeliveryTime = smsDeliveryTime;
        return this;
    }

    public MessageBody smsSendingAttemptsCount(Long smsSendingAttemptsCount) {
        this.smsSendingAttemptsCount = smsSendingAttemptsCount;
        return this;
    }

    public MessageBody subject(String subject) {
        this.subject = subject;
        return this;
    }

    public MessageBody to(MessageRecipientInfo[] to) {
        this.to = to;
        return this;
    }

    public MessageBody type(String type) {
        this.type = type;
        return this;
    }

    public MessageBody vmTranscriptionStatus(String vmTranscriptionStatus) {
        this.vmTranscriptionStatus = vmTranscriptionStatus;
        return this;
    }

}
