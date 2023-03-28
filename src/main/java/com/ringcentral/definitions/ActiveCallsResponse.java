package com.ringcentral.definitions;


public class ActiveCallsResponse {
    /**
     * Link to the list of active call records
     * Format: uri
     */
    public String uri;
    /**
     * List of call log records
     * Required
     */
    public CallLogRecord[] records;
    /**
     * Required
     */
    public CallLogNavigationInfo navigation;
    /**
     * Required
     */
    public CallLogPagingInfo paging;

    public ActiveCallsResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

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
