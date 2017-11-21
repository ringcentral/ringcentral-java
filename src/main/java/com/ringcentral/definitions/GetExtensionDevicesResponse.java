package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetExtensionDevicesResponse
{
    // List of extension devices
    public GetDeviceInfoResponse[] records;
    public GetExtensionDevicesResponse records(GetDeviceInfoResponse[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetExtensionDevicesResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetExtensionDevicesResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
