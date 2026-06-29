package com.ringcentral.definitions;

public class MthSyncDeletedMessage {
    /** Required Enum: DeletedMessage */
    public String recordType;

    public MthSyncDeletedMessage recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /** Internal identifier of a message Required */
    public String id;

    public MthSyncDeletedMessage id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a message thread Required */
    public String threadId;

    public MthSyncDeletedMessage threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /** Message availability status Required Enum: Deleted */
    public String availability;

    public MthSyncDeletedMessage availability(String availability) {
        this.availability = availability;
        return this;
    }

    /** Message last modification date/time Required Format: date-time */
    public String lastModifiedTime;

    public MthSyncDeletedMessage lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
}
