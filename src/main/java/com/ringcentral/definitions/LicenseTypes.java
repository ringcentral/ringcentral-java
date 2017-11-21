package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LicenseTypes
{
    // Canonical URI of a license types resource
    public String uri;
    public LicenseTypes uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of supported licenses
    public LicenseInfo[] records;
    public LicenseTypes records(LicenseInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public LicenseTypes paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public LicenseTypes navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
