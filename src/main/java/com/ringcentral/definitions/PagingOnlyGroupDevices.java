package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PagingOnlyGroupDevices
{
    // List of paging devices assigned to this group
    public PagingDeviceInfo[] records;
    public PagingOnlyGroupDevices records(PagingDeviceInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public PagingOnlyGroupDevices navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public PagingOnlyGroupDevices paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
