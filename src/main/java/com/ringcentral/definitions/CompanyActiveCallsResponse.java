package com.ringcentral.definitions;


public class CompanyActiveCallsResponse
{
    /**
     * Link to the list of company active call records
     * Format: uri
     */
    public String uri;
    public CompanyActiveCallsResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call log records
     * Required
     */
    public CompanyCallLogRecord[] records;
    public CompanyActiveCallsResponse records(CompanyCallLogRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public CallLogNavigationInfo navigation;
    public CompanyActiveCallsResponse navigation(CallLogNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public CallLogPagingInfo paging;
    public CompanyActiveCallsResponse paging(CallLogPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}