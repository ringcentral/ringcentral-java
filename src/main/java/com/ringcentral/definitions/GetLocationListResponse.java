package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetLocationListResponse
{
    // List of locations
    public LocationInfo[] records;
    public GetLocationListResponse records(LocationInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetLocationListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetLocationListResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
