package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ParkLocationResponse
{
    // List of user extensions allowed to park and unpark calls to/from the extension specified
    public ExtensionInfo[] records;
    public ParkLocationResponse records(ExtensionInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public ParkLocationResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public ParkLocationResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
