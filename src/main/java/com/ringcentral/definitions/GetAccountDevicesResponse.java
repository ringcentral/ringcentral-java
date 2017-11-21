package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetAccountDevicesResponse
{
    // List of extension records
    public GetDeviceInfoResponse[] records;
    public GetAccountDevicesResponse records(GetDeviceInfoResponse[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetAccountDevicesResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetAccountDevicesResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
