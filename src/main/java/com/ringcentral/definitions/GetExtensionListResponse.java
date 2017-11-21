package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetExtensionListResponse
{
    // List of extensions with extension information
    public GetExtensionInfoResponse[] records;
    public GetExtensionListResponse records(GetExtensionInfoResponse[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetExtensionListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetExtensionListResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
