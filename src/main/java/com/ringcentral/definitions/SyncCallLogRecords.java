package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SyncCallLogRecords
{
    //
    public String uri;
    public SyncCallLogRecords uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public CallLogRecordResource[] records;
    public SyncCallLogRecords records(CallLogRecordResource[] records) {
        this.records = records;
        return this;
    }
    //
    public SyncInfo syncInfo;
    public SyncCallLogRecords syncInfo(SyncInfo syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
}
