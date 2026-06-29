package com.ringcentral.definitions;

public class MthSyncDeletedNote {
    /** Required Enum: DeletedNote */
    public String recordType;

    public MthSyncDeletedNote recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /** Internal identifier of a note Required */
    public String id;

    public MthSyncDeletedNote id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a message thread Required */
    public String threadId;

    public MthSyncDeletedNote threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Note availability status Required Enum: Deleted */
    public String availability;

    public MthSyncDeletedNote availability(String availability) {
        this.availability = availability;
        return this;
    }

    /** Note last modification date/time Required Format: date-time */
    public String lastModifiedTime;

    public MthSyncDeletedNote lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
