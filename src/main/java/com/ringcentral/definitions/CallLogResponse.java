package com.ringcentral.definitions;


public class CallLogResponse {
    /**
     * Link to the list of company/user call log records
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
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public CallLogResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallLogResponse records(CallLogRecord[] records) {
        this.records = records;
        return this;
    }

    public CallLogResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallLogResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
