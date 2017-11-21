package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountActiveCallsResponse
{
    // List of call log records
    public CallLogRecord[] records;
    public AccountActiveCallsResponse records(CallLogRecord[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public AccountActiveCallsResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public AccountActiveCallsResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
