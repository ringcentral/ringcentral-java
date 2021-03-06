package com.ringcentral.definitions;


public class UserCallLogResponse {
    /**
     * List of call log records
     * Required
     */
    public UserCallLogRecord[] records;
    /**
     * Required
     */
    public CallLogNavigationInfo navigation;
    /**
     * Required
     */
    public CallLogPagingInfo paging;

    public UserCallLogResponse records(UserCallLogRecord[] records) {
        this.records = records;
        return this;
    }

    public UserCallLogResponse navigation(CallLogNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public UserCallLogResponse paging(CallLogPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
