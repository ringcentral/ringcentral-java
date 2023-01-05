package com.ringcentral.definitions;


public class SyncInfo
{
    /**
     * Enum: FSync, ISync
     */
    public String syncType;
    public SyncInfo syncType(String syncType)
    {
        this.syncType = syncType;
        return this;
    }

    /**
     */
    public String syncToken;
    public SyncInfo syncToken(String syncToken)
    {
        this.syncToken = syncToken;
        return this;
    }

    /**
     * Format: date-time
     */
    public String syncTime;
    public SyncInfo syncTime(String syncTime)
    {
        this.syncTime = syncTime;
        return this;
    }

    /**
     */
    public Boolean olderRecordsExist;
    public SyncInfo olderRecordsExist(Boolean olderRecordsExist)
    {
        this.olderRecordsExist = olderRecordsExist;
        return this;
    }
}