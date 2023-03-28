package com.ringcentral.definitions;


/**
 * Sync type, token and time
 */
public class SyncInfoMessages {
    /**
     * Type of message synchronization request:
     * - FSync -- full sync
     * - ISync -- incremental sync
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     * Synchronization token
     */
    public String syncToken;
    /**
     * Last synchronization datetime in ISO 8601 format including
     * timezone, for example 2016-03-10T18:07:52.534Z
     * Format: date-time
     */
    public String syncTime;
    /**
     *
     */
    public Boolean olderRecordsExist;

    public SyncInfoMessages syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncInfoMessages syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncInfoMessages syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }

    public SyncInfoMessages olderRecordsExist(Boolean olderRecordsExist) {
        this.olderRecordsExist = olderRecordsExist;
        return this;
    }
}
