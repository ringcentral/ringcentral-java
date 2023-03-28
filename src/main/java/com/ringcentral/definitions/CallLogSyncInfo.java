package com.ringcentral.definitions;


public class CallLogSyncInfo {
    /**
     * Type of call log synchronization request: full or incremental sync
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     * Synchronization token
     */
    public String syncToken;
    /**
     * Time of the last synchronization in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Format: date-time
     */
    public String syncTime;

    public CallLogSyncInfo syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public CallLogSyncInfo syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public CallLogSyncInfo syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }
}
