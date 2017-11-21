package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionActiveCallsResponse
{
    // List of call log records
    public CallLogRecord[] records;
    public ExtensionActiveCallsResponse records(CallLogRecord[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public ExtensionActiveCallsResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public ExtensionActiveCallsResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
