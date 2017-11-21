package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SyncMessages
{
    //
    public String uri;
    public SyncMessages uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public MessageInfoResource[] records;
    public SyncMessages records(MessageInfoResource[] records) {
        this.records = records;
        return this;
    }
    //
    public SyncInfo syncInfo;
    public SyncMessages syncInfo(SyncInfo syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
}
