package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PagingOnlyGroupUsers
{
    // List of users allowed to page this group
    public PagingGroupExtensionInfo[] records;
    public PagingOnlyGroupUsers records(PagingGroupExtensionInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public PagingOnlyGroupUsers navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public PagingOnlyGroupUsers paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
