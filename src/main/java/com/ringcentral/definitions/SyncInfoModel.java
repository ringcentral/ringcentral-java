package com.ringcentral.definitions;

public class SyncInfoModel {
    /**
     * Type of message synchronization request: - FSync -- full sync - ISync -- incremental sync
     * Required Enum: FSync, ISync
     */
    public String syncType;

    public SyncInfoModel syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    /** Synchronization token Required */
    public String syncToken;

    public SyncInfoModel syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    /** Last synchronization date/time Required Format: date-time */
    public String syncTime;

    public SyncInfoModel syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }
}
