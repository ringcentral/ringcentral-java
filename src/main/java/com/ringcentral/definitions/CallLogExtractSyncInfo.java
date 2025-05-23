package com.ringcentral.definitions;


public class CallLogExtractSyncInfo {
    /**
     * Type of call log synchronization request: full or incremental sync
     * Required
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     * Synchronization token
     * Required
     */
    public String syncToken;
    /**
     * Time of the last synchronization in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example *2016-03-10T18:07:52.534Z*
     * Required
     * Format: date-time
     */
    public String syncTime;
    /**
     * Identifies if there are more calls data can be returned in the next API call (with &#039;ISync&#039; sync type)
     * Required
     */
    public Boolean newerRecordsExist;

    public CallLogExtractSyncInfo syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public CallLogExtractSyncInfo syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public CallLogExtractSyncInfo syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }

    public CallLogExtractSyncInfo newerRecordsExist(Boolean newerRecordsExist) {
        this.newerRecordsExist = newerRecordsExist;
        return this;
    }
}
