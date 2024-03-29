package com.ringcentral.definitions;


public class GetMessageSyncResponse {
    /**
     * Link to the message sync resource
     * Format: uri
     */
    public String uri;
    /**
     * List of message records with synchronization information
     * Required
     */
    public GetMessageInfoResponse[] records;
    /**
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
