package com.ringcentral.definitions;


public class CallLogExtractSyncResponse
{
    /**
     * Link to the list of call log records with sync information
     * Required
     * Format: uri
     */
    public String uri;
    public CallLogExtractSyncResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call log records
     * Required
     */
    public CallLogRecord[] records;
    public CallLogExtractSyncResponse records(CallLogRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public CallLogExtractSyncInfo syncInfo;
    public CallLogExtractSyncResponse syncInfo(CallLogExtractSyncInfo syncInfo)
    {
        this.syncInfo = syncInfo;
        return this;
    }
}