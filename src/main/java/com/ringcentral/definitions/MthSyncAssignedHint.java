package com.ringcentral.definitions;

public class MthSyncAssignedHint {
    /**
     * Required Enum: ThreadCreatedHint, ThreadResolvedHint, ThreadDeletedHint, ThreadAssignedHint
     */
    public String recordType;

    public MthSyncAssignedHint recordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    /** Internal identifier of a system message Required */
    public String id;

    public MthSyncAssignedHint id(String id) {
        this.id = id;
        return this;
    }

    /** Internal identifier of a message thread Required */
    public String threadId;

    public MthSyncAssignedHint threadId(String threadId) {
        this.threadId = threadId;
        return this;
    }

    /**
     * Last modification date/time (always the same as a creation time since the system hints are
     * immutable) Required Format: date-time
     */
    public String lastModifiedTime;

    public MthSyncAssignedHint lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /** Initiator of the action. Can be missing if the action was initiated by the system. */
    public MthSyncAssignedHintInitiator initiator;

    public MthSyncAssignedHint initiator(MthSyncAssignedHintInitiator initiator) {
        this.initiator = initiator;
        return this;
    }

    /** */
    public ThreadUserModel assignee;

    public MthSyncAssignedHint assignee(ThreadUserModel assignee) {
        this.assignee = assignee;
        return this;
    }

    /** */
    public ThreadUserModel previousAssignee;

    public MthSyncAssignedHint previousAssignee(ThreadUserModel previousAssignee) {
        this.previousAssignee = previousAssignee;
        return this;
    }
}
