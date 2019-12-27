package com.ringcentral.definitions;


public class UserActiveCallsResponse {
    /**
     * Link to the list of user active call records
     */
    public String uri;
    /**
     * List of call log records
     * Required
     */
    public UserCallLogRecord[] records;
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

    public UserActiveCallsResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserActiveCallsResponse records(UserCallLogRecord[] records) {
        this.records = records;
        return this;
    }

    public UserActiveCallsResponse navigation(CallLogNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public UserActiveCallsResponse paging(CallLogPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
