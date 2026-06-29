package com.ringcentral.definitions;

public class ThreadEntrySyncItem {
    /**
     * Required Enum: AliveMessage, DeletedMessage, AliveNote, DeletedNote, ThreadCreatedHint,
     * ThreadResolvedHint, ThreadDeletedHint, ThreadAssignedHint
     */
    public String recordType;

    public ThreadEntrySyncItem recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /** Internal identifier of a system message Required */
    public String id;

    public ThreadEntrySyncItem id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a message thread Required */
    public String threadId;

    public ThreadEntrySyncItem threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Thread/message availability Required Enum: Alive, Deleted */
    public String availability;

    public ThreadEntrySyncItem availability(String availability) {
        this.availability = availability;
        return this;
    }

    /** Note creation date/time Required Format: date-time */
    public String creationTime;

    public ThreadEntrySyncItem creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Message direction (inbound or outbound) Required Enum: Inbound, Outbound */
    public String direction;

    public ThreadEntrySyncItem direction(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Last modification date/time (always the same as a creation time since the system hints are
     * immutable) Required Format: date-time
     */
    public String lastModifiedTime;

    public ThreadEntrySyncItem lastModifiedTime(String lastModifiedTime) {
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

    public ThreadEntrySyncItem messageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }

    /** Message or note text Example: Hello, how are you doing today? */
    public String text;

    public ThreadEntrySyncItem text(String text) {
        this.text = text;
        return this;
    }

    /** Message attachments (if any) */
    public MessageAttachmentResponseEntry[] attachments;

    public ThreadEntrySyncItem attachments(MessageAttachmentResponseEntry[] attachments) {
        this.attachments = attachments;
        return this;
    }

    /** Thread note author */
    public ThreadEntrySyncItemAuthor author;

    public ThreadEntrySyncItem author(ThreadEntrySyncItemAuthor author) {
        this.author = author;
        return this;
    }

    /** Initiator of the action. Can be missing if the action was initiated by the system. */
    public ThreadEntrySyncItemInitiator initiator;

    public ThreadEntrySyncItem initiator(ThreadEntrySyncItemInitiator initiator) {
        this.initiator = initiator;
        return this;
    }

    /** */
    public ThreadUserModel assignee;

    public ThreadEntrySyncItem assignee(ThreadUserModel assignee) {
        this.assignee = assignee;
        return this;
    }

    /** */
    public ThreadUserModel previousAssignee;

    public ThreadEntrySyncItem previousAssignee(ThreadUserModel previousAssignee) {
        this.previousAssignee = previousAssignee;
        return this;
    }
}
