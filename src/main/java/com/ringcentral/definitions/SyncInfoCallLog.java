package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SyncInfoCallLog
{
    // Type of synchronization
    public String syncType;
    public SyncInfoCallLog syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }
    // Synchronization token
    public String syncToken;
    public SyncInfoCallLog syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
    // The last synchronization datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String syncTime;
    public SyncInfoCallLog syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }
}
