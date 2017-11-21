package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetMessageSyncResponse
{
    // List of message records with synchronization information
    public GetMessageInfoResponse[] records;
    public GetMessageSyncResponse records(GetMessageInfoResponse[] records) {
        this.records = records;
        return this;
    }
    // Sync type, token and time
    public SyncInfoMessages syncInfo;
    public GetMessageSyncResponse syncInfo(SyncInfoMessages syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }
}
