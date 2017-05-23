package com.ringcentral.definitions;

public class MessageInfo {
    // Internal identifier of a message
    public String id;
    // Canonical URI of a message
    public String uri;
    // The list of message attachments
    public MessageAttachmentInfo[] attachments;
    // Message availability status. Message in 'Deleted' state is still preserved with all its attachments and can be restored. 'Purged' means that all attachments are already deleted and the message itself is about to be physically deleted shortly
    public String availability;
    // SMS and Pager only. Identifier of the conversation the message belongs to
    public Long conversationId;
    // Message creation datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String creationTime;
    // SMS only. Delivery error code returned by gateway
    public String deliveryErrorCode;
    // Message direction. Note that for some message types not all directions are allowed. For example voicemail messages can be only inbound
    public String direction;
    // Fax only. Page count in fax message
    public Long faxPageCount;
    // Fax only. Resolution of fax message. ('High' for black and white image scanned at 200 dpi, 'Low' for black and white image scanned at 100 dpi)
    public String faxResolution;
    // Sender information
    public MessageInfo_CallerInfo from;
    // The datetime when the message was modified on server in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String lastModifiedTime;
    // Message status. Different message types may have different allowed status values.
    public String messageStatus;
    // Pager only True if at least one of the message recipients is Department extension
    public Boolean pgToDepartment;
    // Message priority
    public String priority;
    // Message read status
    public String readStatus;
    // SMS only. The datetime when outbound SMS was delivered to recipient's handset in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. It is filled only if the carrier sends a delivery receipt to RingCentral
    public String smsDeliveryTime;
    // SMS only. Number of attempts made to send an outbound SMS to the gateway (if gateway is temporary unavailable)
    public Long smsSendingAttemptsCount;
    // Message subject. For SMS and Pager messages it replicates message text which is also returned as an attachment
    public String subject;
    // Recipient information
    public MessageInfo_CallerInfo[] to;
    // Message type
    public String type;
    // Voicemail only. Status of voicemail to text transcription. If VoicemailToText feature is not activated for account, the 'NotAvailable' value is returned
    public String vmTranscriptionStatus;
}
