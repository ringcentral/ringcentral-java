package com.ringcentral.definitions;


public class SyncInfoCallLog {
    /**
     * Type of synchronization
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     * Synchronization token
     */
    public String syncToken;
    /**
     * The last synchronization datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String syncTime;

    public SyncInfoCallLog syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncInfoCallLog syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncInfoCallLog syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }

}
