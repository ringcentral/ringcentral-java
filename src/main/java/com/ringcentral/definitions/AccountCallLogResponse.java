package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountCallLogResponse
{
    // List of call log records
    public CallLogRecord[] records;
    public AccountCallLogResponse records(CallLogRecord[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public AccountCallLogResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public AccountCallLogResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
