package com.ringcentral.definitions;


public class AccountCallLogResponse {
    /**
     * List of call log records
     * Required
     */
    public CallLogRecord[] records;
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

    public AccountCallLogResponse records(CallLogRecord[] records) {
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
