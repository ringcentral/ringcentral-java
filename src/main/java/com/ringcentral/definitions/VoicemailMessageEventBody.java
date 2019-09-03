package com.ringcentral.definitions;


public class VoicemailMessageEventBody {
    /**
     * Internal identifier of a message
     */
    public String id;
    /**
     * Message receiver(s) information
     */
    public NotificationRecipientInfo[] to;
    /**
     * Message sender information
     */
    public SenderInfo from;
    /**
     * Type of a message
     * Enum: Voicemail
     */
    public String type;
    /**
     * Message creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2019-03-10T18:07:52.534Z*
     */
    public String creationTime;
    /**
     * Datetime when the message was modified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2019-03-10T18:07:52.534Z*
     */
    public String lastModifiedTime;
    /**
     * Status of a message
     * Default: Unread
     */
    public String readStatus;
    /**
     * Message priority
     * Default: Normal
     */
    public String priority;
    /**
     * Message attachment data
     */
    public MessageAttachmentInfo[] attachments;
    /**
     * Message direction
     * Default: Inbound
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * Message availability status
     * Default: Alive
     */
    public String availability;
    /**
     * Message subject. It replicates message text which is also returned as an attachment
     */
    public String subject;
    /**
     * Status of a message
     * Default: Received
     */
    public String messageStatus;
    /**
     * Internal identifier of a conversation this message belongs to
     */
    public String conversationId;
    /**
     * Specifies if a voicemail message transcription is already completed or not
     */
    public String vmTranscriptionStatus;

    public VoicemailMessageEventBody id(String id) {
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

    public VoicemailMessageEventBody conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public VoicemailMessageEventBody vmTranscriptionStatus(String vmTranscriptionStatus) {
        this.vmTranscriptionStatus = vmTranscriptionStatus;
        return this;
    }

}
