package com.ringcentral.definitions;


public class ActiveCallsResponse
{
    /**
     * Link to the list of active call records
     * Format: uri
     */
    public String uri;
    public ActiveCallsResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call log records
     * Required
     */
    public CallLogRecord[] records;
    public ActiveCallsResponse records(CallLogRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public CallLogNavigationInfo navigation;
    public ActiveCallsResponse navigation(CallLogNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public CallLogPagingInfo paging;
    public ActiveCallsResponse paging(CallLogPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}