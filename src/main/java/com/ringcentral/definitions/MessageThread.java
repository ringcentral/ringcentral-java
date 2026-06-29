package com.ringcentral.definitions;

public class MessageThread {
    /** Thread ID Required */
    public String id;

    public MessageThread id(String id) {
        this.id = id;
        return this;
    }

    /** Thread human-readable label */
    public String label;

    public MessageThread label(String label) {
        this.label = label;
        return this;
    }

    /** Thread status Required Enum: Open, Resolved */
    public String status;

    public MessageThread status(String status) {
        this.status = status;
        return this;
    }

    /**
     * Thread status transition reason (for threads in `Resolved` status only):
     *
     * <p>- `Manual` - the thread was resolved manually; - `ThreadExpired` - the thread was
     * automatically resolved according to TTL settings; - `OwnerDeleted` - the thread owner&#039;s
     * extension was deleted; - `OwnerPhoneNumberDeleted` - the thread owner&#039;s phone number
     * this thread was created for was deleted. Enum: Manual, ThreadExpired, OwnerDeleted,
     * OwnerPhoneNumberDeleted
     */
    public String statusReason;

    public MessageThread statusReason(String statusReason) {
        this.statusReason = statusReason;
        return this;
    }

    /** Thread/message availability Required Enum: Alive, Deleted */
    public String availability;

    public MessageThread availability(String availability) {
        this.availability = availability;
        return this;
    }

    /** Required */
    public OwnerResource owner;

    public MessageThread owner(OwnerResource owner) {
        this.owner = owner;
        return this;
    }

    /** Thread owner phone number information */
    public MessageThreadOwnerParty ownerParty;

    public MessageThread ownerParty(MessageThreadOwnerParty ownerParty) {
        this.ownerParty = ownerParty;
        return this;
    }

    /** Thread guest phone number information */
    public MessageThreadGuestParty guestParty;

    public MessageThread guestParty(MessageThreadGuestParty guestParty) {
        this.guestParty = guestParty;
        return this;
    }

    /** Cleared automatically when the thread is resolved or deleted */
    public MessageThreadAssignee assignee;

    public MessageThread assignee(MessageThreadAssignee assignee) {
        this.assignee = assignee;
        return this;
    }

    /** Thread creation time Required Format: date-time */
    public String creationTime;

    public MessageThread creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /** Thread last modification time Required Format: date-time */
    public String lastModifiedTime;

    public MessageThread lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
