package com.ringcentral.definitions;


public class CallLogResponse
{
    /**
     * Link to the list of company/user call log records
     * Format: uri
     */
    public String uri;
    public CallLogResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call log records
     * Required
     */
    public CallLogRecord[] records;
    public CallLogResponse records(CallLogRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public PageNavigationModel navigation;
    public CallLogResponse navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    public CallLogResponse paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}