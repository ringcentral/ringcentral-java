package com.ringcentral.definitions;


public class CompanyCallLogSyncInfo {
    /**
     * Type of synchronization
     * Enum: Fsync, ISync
     */
    public String syncType;
    /**
     * Synchronization token
     */
    public String syncToken;
    /**
     * Time of last synchronization in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601] format including timezone, for example *2016-03-10T18:07:52.534Z*
     */
    public String syncTime;

    public CompanyCallLogSyncInfo syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public CompanyCallLogSyncInfo syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public CompanyCallLogSyncInfo syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }

}
