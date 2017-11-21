package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetTimezoneListResponse
{
    // List of timezones
    public GetTimezoneInfoResponse[] records;
    public GetTimezoneListResponse records(GetTimezoneInfoResponse[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetTimezoneListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetTimezoneListResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
