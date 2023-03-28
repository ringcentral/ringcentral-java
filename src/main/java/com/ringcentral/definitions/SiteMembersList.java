package com.ringcentral.definitions;


public class SiteMembersList {
    /**
     * Link to a site members list resource
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public SiteMemberInfo[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public SiteMembersList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public SiteMembersList records(SiteMemberInfo[] records) {
        this.records = records;
        return this;
    }

    public SiteMembersList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public SiteMembersList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
