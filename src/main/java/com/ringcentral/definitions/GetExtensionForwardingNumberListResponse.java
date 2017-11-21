package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetExtensionForwardingNumberListResponse
{
    // List of forwarding phone numbers
    public ForwardingNumberInfo[] records;
    public GetExtensionForwardingNumberListResponse records(ForwardingNumberInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetExtensionForwardingNumberListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetExtensionForwardingNumberListResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
