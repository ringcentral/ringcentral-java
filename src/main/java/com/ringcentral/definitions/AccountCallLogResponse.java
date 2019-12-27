package com.ringcentral.definitions;


public class AccountCallLogResponse {
    /**
     * Link to the list of company call log records
     */
    public String uri;
    /**
     * List of call log records
     */
    public CompanyCallLogRecord[] records;
    /**
     * Information on navigation
     */
    public CallLogNavigationInfo navigation;
    /**
     * Information on paging
     */
    public CallLogPagingInfo paging;

    public AccountCallLogResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountCallLogResponse records(CompanyCallLogRecord[] records) {
        this.records = records;
        return this;
    }

    public AccountCallLogResponse navigation(CallLogNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public AccountCallLogResponse paging(CallLogPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
