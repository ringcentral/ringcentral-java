package com.ringcentral.definitions;


public class GetMessageInfoResponse {
    /**
     * Internal identifier of a message
     * Format: int64
     * Example: 1724099032020
     */
    public Long id;
    /**
     * Canonical URI of a message
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * List of message attachments
     */
    public MessageAttachmentInfo[] attachments;
    /**
     * Message availability status. Message in &#039;Deleted&#039; state is still
     * preserved with all its attachments and can be restored. &#039;Purged&#039; means
     * that all attachments are already deleted and the message itself is about
     * to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * SMS and Pager only. Identifier of a conversation the message
     * belongs to
     * Format: int64
     */
    public Long conversationId;
    /**
     *
     */
    public ConversationInfo conversation;
    /**
     * Message creation date/time in ISO 8601 format including timezone,
     * for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String creationTime;
    /**
     * Text message direction. Note that for some message types not all
     * directions are allowed. For example voicemail messages can
     * be only inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Fax only. Page count in a fax message
     * Format: int32
     */
    public Long faxPageCount;
    /**
     * Fax only. Resolution of a fax message. &#039;High&#039; for black and
     * white image scanned at 200 dpi, &#039;Low&#039; for black and white image scanned
     * at 100 dpi
     * Enum: High, Low
     */
    public String faxResolution;
    /**
     *
     */
    public MessageStoreCallerInfoResponseFrom from;
    /**
     * The date/time when the message was modified on server in ISO
     * 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String lastModifiedTime;
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
     * Pager only. `true` if at least one of the message recipients is
     * &#039;Department&#039; extension
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
     * SMS only. Date/time when outbound SMS was delivered to recipient&#039;s
     * handset in ISO 8601 format including timezone, for example
     * 2016-03-10T18:07:52.534Z. It is filled only if a carrier sends a delivery
     * receipt to RingCentral
     * Format: date-time
     */
    public String smsDeliveryTime;
    /**
     * SMS only. Number of attempts made to send an outbound SMS to
     * the Gateway (if Gateway is temporary unavailable)
     * Format: int32
     */
    public Long smsSendingAttemptsCount;
    /**
     * Message subject. For SMS and Pager messages it replicates message
     * text which is also returned as an attachment
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
    /**
     * Voicemail only. Status of a voicemail to text transcription.
     * If &#039;VoicemailToText&#039; feature is not activated for account,
     * the &#039;NotAvailable&#039; value is returned
     * Enum: NotAvailable, InProgress, TimedOut, Completed, CompletedPartially, Failed, Unknown
     */
    public String vmTranscriptionStatus;
    /**
     * Cover page identifier. If coverIndex is set to &#039;0&#039; (zero) cover
     * page is not attached. For the list of available cover page identifiers
     * (1-13) please call the Fax Cover Pages method. If not specified,
     * the default cover page is attached (which is configured in &#039;Outbound
     * Fax Settings&#039;)
     * Format: int32
     */
    public Long coverIndex;
    /**
     * Cover page text, entered by the fax sender and printed on the
     * cover page. Maximum length is limited to 1024 symbols
     */
    public String coverPageText;

    public GetMessageInfoResponse id(Long id) {
        this.id = id;
        return this;
    }

    public GetMessageInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetMessageInfoResponse extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public GetMessageInfoResponse attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public GetMessageInfoResponse availability(String availability) {
        this.availability = availability;
        return this;
    }

    public GetMessageInfoResponse conversationId(Long conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public GetMessageInfoResponse conversation(ConversationInfo conversation) {
        this.conversation = conversation;
        return this;
    }

    public GetMessageInfoResponse creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public GetMessageInfoResponse direction(String direction) {
        this.direction = direction;
        return this;
    }

    public GetMessageInfoResponse faxPageCount(Long faxPageCount) {
        this.faxPageCount = faxPageCount;
        return this;
    }

    public GetMessageInfoResponse faxResolution(String faxResolution) {
        this.faxResolution = faxResolution;
        return this;
    }

    public GetMessageInfoResponse from(MessageStoreCallerInfoResponseFrom from) {
        this.from = from;
        return this;
    }

    public GetMessageInfoResponse lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public GetMessageInfoResponse messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public GetMessageInfoResponse pgToDepartment(Boolean pgToDepartment) {
        this.pgToDepartment = pgToDepartment;
        return this;
    }

    public GetMessageInfoResponse priority(String priority) {
        this.priority = priority;
        return this;
    }

    public GetMessageInfoResponse readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public GetMessageInfoResponse smsDeliveryTime(String smsDeliveryTime) {
        this.smsDeliveryTime = smsDeliveryTime;
        return this;
    }

    public GetMessageInfoResponse smsSendingAttemptsCount(Long smsSendingAttemptsCount) {
        this.smsSendingAttemptsCount = smsSendingAttemptsCount;
        return this;
    }

    public GetMessageInfoResponse subject(String subject) {
        this.subject = subject;
        return this;
    }

    public GetMessageInfoResponse to(MessageStoreCallerInfoResponseTo[] to) {
        this.to = to;
        return this;
    }

    public GetMessageInfoResponse type(String type) {
        this.type = type;
        return this;
    }

    public GetMessageInfoResponse vmTranscriptionStatus(String vmTranscriptionStatus) {
        this.vmTranscriptionStatus = vmTranscriptionStatus;
        return this;
    }

    public GetMessageInfoResponse coverIndex(Long coverIndex) {
        this.coverIndex = coverIndex;
        return this;
    }

    public GetMessageInfoResponse coverPageText(String coverPageText) {
        this.coverPageText = coverPageText;
        return this;
    }
}
