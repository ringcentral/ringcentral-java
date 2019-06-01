package com.ringcentral.definitions;


public class GetMessageSyncResponse {
    /**
     * List of message records with synchronization information
     * Required
     */
    public GetMessageInfoResponse[] records;
    /**
     * Sync type, token and time
     * Required
     */
    public SyncInfoMessages syncInfo;

    public GetMessageSyncResponse records(GetMessageInfoResponse[] records) {
        this.records = records;
        return this;
    }

    public GetMessageSyncResponse syncInfo(SyncInfoMessages syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }

}
