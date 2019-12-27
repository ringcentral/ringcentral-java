package com.ringcentral.definitions;


public class CompanyActiveCallsResponse {
    /**
     * Link to the list of company active call records
     */
    public String uri;
    /**
     * List of call log records
     * Required
     */
    public CompanyCallLogRecord[] records;
    /**
     * Information on navigation
     * Required
     */
    public CallLogNavigationInfo navigation;
    /**
     * Information on paging
     * Required
     */
    public CallLogPagingInfo paging;

    public CompanyActiveCallsResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CompanyActiveCallsResponse records(CompanyCallLogRecord[] records) {
        this.records = records;
        return this;
    }

    public CompanyActiveCallsResponse navigation(CallLogNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public CompanyActiveCallsResponse paging(CallLogPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
