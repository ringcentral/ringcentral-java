package com.ringcentral.definitions;


public class SyncInfo {
    /**
     * Enum: FSync, ISync
     */
    public String syncType;
    /**
     *
     */
    public String syncToken;
    /**
     *
     */
    public String syncTime;
    /**
     *
     */
    public Boolean olderRecordsExist;

    public SyncInfo syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }

    public SyncInfo syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }

    public SyncInfo syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }

    public SyncInfo olderRecordsExist(Boolean olderRecordsExist) {
        this.olderRecordsExist = olderRecordsExist;
        return this;
    }

}
