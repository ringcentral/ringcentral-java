package com.ringcentral.definitions;


public class GetSMSMessageInfoResponse {
    /**
     * Internal identifier of a message
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
     * Message availability status. Message in 'Deleted' state is still preserved with all its attachments and can be restored. 'Purged' means that all attachments are already deleted and the message itself is about to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * SMS and Pager only. Identifier of a conversation that the message belongs to
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
     * SMS only. Delivery error code returned by gateway
     */
    public String deliveryErrorCode;
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
     * Message status. Different message types may have different allowed status values. For outbound faxes the aggregated message status is returned: If status for at least one recipient is 'Queued', then 'Queued' value is returned If status for at least one recipient is 'SendingFailed', then 'SendingFailed' value is returned In other cases Sent status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;
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
     * Format: date-time
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
    public MessageStoreCallerInfoResponseTo[] to;
    /**
     * Message type
     * Enum: Fax, SMS, VoiceMail, Pager, Text
     */
    public String type;

    public GetSMSMessageInfoResponse id(Long id) {
        this.id = id;
        return this;
    }

    public GetSMSMessageInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetSMSMessageInfoResponse attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public GetSMSMessageInfoResponse availability(String availability) {
        this.availability = availability;
        return this;
    }

    public GetSMSMessageInfoResponse conversationId(Long conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public GetSMSMessageInfoResponse conversation(ConversationInfo conversation) {
        this.conversation = conversation;
        return this;
    }

    public GetSMSMessageInfoResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GetSMSMessageInfoResponse deliveryErrorCode(String deliveryErrorCode) {
        this.deliveryErrorCode = deliveryErrorCode;
        return this;
    }

    public GetSMSMessageInfoResponse direction(String direction) {
        this.direction = direction;
        return this;
    }

    public GetSMSMessageInfoResponse from(MessageStoreCallerInfoResponseFrom from) {
        this.from = from;
        return this;
    }

    public GetSMSMessageInfoResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GetSMSMessageInfoResponse messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public GetSMSMessageInfoResponse priority(String priority) {
        this.priority = priority;
        return this;
    }

    public GetSMSMessageInfoResponse readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public GetSMSMessageInfoResponse smsDeliveryTime(String smsDeliveryTime) {
        this.smsDeliveryTime = smsDeliveryTime;
        return this;
    }

    public GetSMSMessageInfoResponse smsSendingAttemptsCount(Long smsSendingAttemptsCount) {
        this.smsSendingAttemptsCount = smsSendingAttemptsCount;
        return this;
    }

    public GetSMSMessageInfoResponse subject(String subject) {
        this.subject = subject;
        return this;
    }

    public GetSMSMessageInfoResponse to(MessageStoreCallerInfoResponseTo[] to) {
        this.to = to;
        return this;
    }

    public GetSMSMessageInfoResponse type(String type) {
        this.type = type;
        return this;
    }
}
