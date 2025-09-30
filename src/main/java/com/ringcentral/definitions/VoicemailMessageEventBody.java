package com.ringcentral.definitions;


/**
 * Notification payload body
 */
public class VoicemailMessageEventBody {
    /**
     * Internal identifier of a message
     * Format: int64
     */
    public Long id;
    /**
     * Message receiver(s) information
     */
    public NotificationRecipientInfo[] to;
    /**
     *
     */
    public SenderInfo from;
    /**
     * Type of message
     * Enum: Voicemail
     */
    public String type;
    /**
     * Message creation date/time in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, for example *2019-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String creationTime;
    /**
     * Date/time when a message was modified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
     * format including timezone, for example *2019-03-10T18:07:52.534Z*
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
     * Message direction (inbound or outbound)
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Message availability status. Message in `Deleted` state is still
     * preserved with all its attachments and can be restored. `Purged` means
     * that all attachments are already deleted and the message itself is about
     * to be physically deleted shortly
     * Enum: Alive, Deleted, Purged
     */
    public String availability;
    /**
     * Message subject. It replicates message text which is also returned as an attachment
     */
    public String subject;
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
    /**
     * Status of a voicemail to text transcription. Specifies if a voicemail message transcription is already completed or not
     * If &#039;VoicemailToText&#039; feature is not activated for account, the &#039;NotAvailable&#039; value is returned
     * Enum: NotAvailable, InProgress, TimedOut, Completed, CompletedPartially, Failed, Unknown
     */
    public String vmTranscriptionStatus;

    public VoicemailMessageEventBody id(Long id) {
        this.id = id;
        return this;
    }

    public VoicemailMessageEventBody to(NotificationRecipientInfo[] to) {
        this.to = to;
        return this;
    }

    public VoicemailMessageEventBody from(SenderInfo from) {
        this.from = from;
        return this;
    }

    public VoicemailMessageEventBody type(String type) {
        this.type = type;
        return this;
    }

    public VoicemailMessageEventBody creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public VoicemailMessageEventBody lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public VoicemailMessageEventBody readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public VoicemailMessageEventBody priority(String priority) {
        this.priority = priority;
        return this;
    }

    public VoicemailMessageEventBody attachments(MessageAttachmentInfo[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public VoicemailMessageEventBody direction(String direction) {
        this.direction = direction;
        return this;
    }

    public VoicemailMessageEventBody availability(String availability) {
        this.availability = availability;
        return this;
    }

    public VoicemailMessageEventBody subject(String subject) {
        this.subject = subject;
        return this;
    }

    public VoicemailMessageEventBody messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public VoicemailMessageEventBody vmTranscriptionStatus(String vmTranscriptionStatus) {
        this.vmTranscriptionStatus = vmTranscriptionStatus;
        return this;
    }
}
