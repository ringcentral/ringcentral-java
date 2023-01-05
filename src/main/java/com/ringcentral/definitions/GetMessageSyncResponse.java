package com.ringcentral.definitions;


public class GetMessageSyncResponse
{
    /**
     * Link to the message sync resource
     */
    public String uri;
    public GetMessageSyncResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of message records with synchronization information
     * Required
     */
    public GetMessageInfoResponse[] records;
    public GetMessageSyncResponse records(GetMessageInfoResponse[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public SyncInfoMessages syncInfo;
    public GetMessageSyncResponse syncInfo(SyncInfoMessages syncInfo)
    {
        this.syncInfo = syncInfo;
        return this;
    }
}