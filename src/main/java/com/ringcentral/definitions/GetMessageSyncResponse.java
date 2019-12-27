package com.ringcentral.definitions;


public class GetMessageSyncResponse {
    /**
     * Link to the message sync resource
     */
    public String uri;
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

    public GetMessageSyncResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetMessageSyncResponse records(GetMessageInfoResponse[] records) {
        this.records = records;
        return this;
    }

    public GetMessageSyncResponse syncInfo(SyncInfoMessages syncInfo) {
        this.syncInfo = syncInfo;
        return this;
    }

}
