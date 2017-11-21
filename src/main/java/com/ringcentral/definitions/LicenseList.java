package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LicenseList
{
    // List of licenses
    public LicenseInfo[] records;
    public LicenseList records(LicenseInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public LicenseList paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public LicenseList navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
