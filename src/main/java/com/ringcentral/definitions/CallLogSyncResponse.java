package com.ringcentral.definitions;


public class CallLogSyncResponse
{
    /**
     * Link to the list of call log records with sync information
     * Required
     * Format: uri
     */
    public String uri;
    public CallLogSyncResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call log records with synchronization information. For `ISync` the total number of returned records is limited to 250;
    * this includes both new records and the old ones, specified by the recordCount parameter
     * Required
     */
    public CallLogRecord[] records;
    public CallLogSyncResponse records(CallLogRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public CallLogSyncInfo syncInfo;
    public CallLogSyncResponse syncInfo(CallLogSyncInfo syncInfo)
    {
        this.syncInfo = syncInfo;
        return this;
    }
}