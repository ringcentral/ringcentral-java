package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetExtensionGrantListResponse
{
    // List of extension grants with the data
    public GrantInfo[] records;
    public GetExtensionGrantListResponse records(GrantInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetExtensionGrantListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetExtensionGrantListResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
