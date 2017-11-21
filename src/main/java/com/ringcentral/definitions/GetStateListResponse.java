package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetStateListResponse
{
    // List of states
    public GetStateInfoResponse[] records;
    public GetStateListResponse records(GetStateInfoResponse[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetStateListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetStateListResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
