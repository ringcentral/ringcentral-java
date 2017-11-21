package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionCallLogResponse
{
    // List of call log records
    public CallLogRecord[] records;
    public ExtensionCallLogResponse records(CallLogRecord[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public ExtensionCallLogResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public ExtensionCallLogResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
