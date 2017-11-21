package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SyncInfo
{
    //
    public String syncType;
    public SyncInfo syncType(String syncType) {
        this.syncType = syncType;
        return this;
    }
    //
    public String syncToken;
    public SyncInfo syncToken(String syncToken) {
        this.syncToken = syncToken;
        return this;
    }
    //
    public String syncTime;
    public SyncInfo syncTime(String syncTime) {
        this.syncTime = syncTime;
        return this;
    }
    //
    public Boolean olderRecordsExist;
    public SyncInfo olderRecordsExist(Boolean olderRecordsExist) {
        this.olderRecordsExist = olderRecordsExist;
        return this;
    }
}
