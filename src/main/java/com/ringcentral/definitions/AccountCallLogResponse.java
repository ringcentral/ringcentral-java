package com.ringcentral.definitions;


public class AccountCallLogResponse
{
    /**
     * Link to the list of company call log records
     * Format: uri
     */
    public String uri;
    public AccountCallLogResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call log records
     * Required
     */
    public CompanyCallLogRecord[] records;
    public AccountCallLogResponse records(CompanyCallLogRecord[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public CallLogNavigationInfo navigation;
    public AccountCallLogResponse navigation(CallLogNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public CallLogPagingInfo paging;
    public AccountCallLogResponse paging(CallLogPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}