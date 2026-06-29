package com.ringcentral.definitions;

public class MthSyncBaseHint {
    /**
     * Required Enum: ThreadCreatedHint, ThreadResolvedHint, ThreadDeletedHint, ThreadAssignedHint
     */
    public String recordType;

    public MthSyncBaseHint recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /** Internal identifier of a system message Required */
    public String id;

    public MthSyncBaseHint id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a message thread Required */
    public String threadId;

    public MthSyncBaseHint threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * Last modification date/time (always the same as a creation time since the system hints are
     * immutable) Required Format: date-time
     */
    public String lastModifiedTime;

    public MthSyncBaseHint lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Initiator of the action. Can be missing if the action was initiated by the system. */
    public MthSyncBaseHintInitiator initiator;

    public MthSyncBaseHint initiator(MthSyncBaseHintInitiator initiator) {
        this.initiator = initiator;
        return this;
    }
}
