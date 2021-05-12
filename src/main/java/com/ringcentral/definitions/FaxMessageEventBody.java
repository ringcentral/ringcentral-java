package com.ringcentral.definitions;


// Notification payload body
public class FaxMessageEventBody {
    /**
     * Internal identifier of a message
     */
    public String id;
    /**
     *
     */
    public NotificationRecipientInfo[] to;
    /**
     *
     */
    public SenderInfo from;
    /**
     * Type of a message
     * Enum: Fax
     */
    public String type;
    /**
     * Message creation datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String creationTime;
    /**
     * Datetime when the message was modified in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String lastModifiedTime;
    /**
     * Status of a message
     * Default: Unread
     */
    public String readStatus;
    /**
     * Default: Normal
     */
    public String priority;
    /**
     * Message attachment data
     */
    public FaxMessageAttachment[] attachments;
    /**
     * Message direction
     * Default: Inbound
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
     * Resolution of a fax message. (&#039;High&#039; for black and white image scanned at 200 dpi, &#039;Low&#039; for black and white image scanned at 100 dpi)
     */
    public String faxResolution;
    /**
     * Page count of a fax message
     */
    public Long faxPageCount;

    public FaxMessageEventBody id(String id) {
        this.id = id;
        return this;
    }

    public FaxMessageEventBody to(NotificationRecipientInfo[] to) {
        this.to = to;
        return this;
    }

    public FaxMessageEventBody from(SenderInfo from) {
        this.from = from;
        return this;
    }

    public FaxMessageEventBody type(String type) {
        this.type = type;
        return this;
    }

    public FaxMessageEventBody creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public FaxMessageEventBody lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public FaxMessageEventBody readStatus(String readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public FaxMessageEventBody priority(String priority) {
        this.priority = priority;
        return this;
    }

    public FaxMessageEventBody attachments(FaxMessageAttachment[] attachments) {
        this.attachments = attachments;
        return this;
    }

    public FaxMessageEventBody direction(String direction) {
        this.direction = direction;
        return this;
    }

    public FaxMessageEventBody availability(String availability) {
        this.availability = availability;
        return this;
    }

    public FaxMessageEventBody subject(String subject) {
        this.subject = subject;
        return this;
    }

    public FaxMessageEventBody messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    public FaxMessageEventBody conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public FaxMessageEventBody faxResolution(String faxResolution) {
        this.faxResolution = faxResolution;
        return this;
    }

    public FaxMessageEventBody faxPageCount(Long faxPageCount) {
        this.faxPageCount = faxPageCount;
        return this;
    }
}
