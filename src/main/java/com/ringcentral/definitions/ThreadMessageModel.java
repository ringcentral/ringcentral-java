package com.ringcentral.definitions;

public class ThreadMessageModel {
    /** Internal identifier of a message Required */
    public String id;

    public ThreadMessageModel id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a message thread Required */
    public String threadId;

    public ThreadMessageModel threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Thread/message availability Required Enum: Alive, Deleted */
    public String availability;

    public ThreadMessageModel availability(String availability) {
        this.availability = availability;
        return this;
    }

    /** Message creation date/time Required Format: date-time */
    public String creationTime;

    public ThreadMessageModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Message direction (inbound or outbound) Required Enum: Inbound, Outbound */
    public String direction;

    public ThreadMessageModel direction(String direction) {
        this.direction = direction;
        return this;
    }

    /** Message last modification date/time Required Format: date-time */
    public String lastModifiedTime;

    public ThreadMessageModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Message status. Different message types may have different allowed status values. For
     * outbound faxes the aggregated message status is returned. If, for multi-recipient outbound
     * message, a status for at least one recipient is `Queued`, then the `Queued` value is
     * returned. If a status for at least one recipient is `SendingFailed`, then the
     * &#039;SendingFailed&#039; value is returned. In other cases, the `Sent` status is returned
     * Enum: Queued, Sent, Delivered, DeliveryFailed, SendingFailed, Received
     */
    public String messageStatus;

    public ThreadMessageModel messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    /** Message or note text Example: Hello, how are you doing today? */
    public String text;

    public ThreadMessageModel text(String text) {
        this.text = text;
        return this;
    }

    /** Message attachments (if any) */
    public MessageAttachmentResponseEntry[] attachments;

    public ThreadMessageModel attachments(MessageAttachmentResponseEntry[] attachments) {
        this.attachments = attachments;
        return this;
    }

    /** Message author (for outbound messages only) */
    public ThreadMessageModelAuthor author;

    public ThreadMessageModel author(ThreadMessageModelAuthor author) {
        this.author = author;
        return this;
    }
}
