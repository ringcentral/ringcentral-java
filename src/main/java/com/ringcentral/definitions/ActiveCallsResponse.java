package com.ringcentral.definitions;


public class ActiveCallsResponse {
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

    public ActiveCallsResponse records(CallLogRecord[] records) {
        this.records = records;
        return this;
    }

    public ActiveCallsResponse navigation(CallLogNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public ActiveCallsResponse paging(CallLogPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
