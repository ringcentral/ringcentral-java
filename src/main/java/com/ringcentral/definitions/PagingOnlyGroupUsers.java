package com.ringcentral.definitions;


public class PagingOnlyGroupUsers {
    /**
     * Link to the list of users allowed to page the Paging Only group
     */
    public String uri;
    /**
     * List of users allowed to page the Paging Only group
     */
    public PagingGroupExtensionInfo[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public PagingOnlyGroupUsers uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PagingOnlyGroupUsers records(PagingGroupExtensionInfo[] records) {
        this.records = records;
        return this;
    }

    public PagingOnlyGroupUsers navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public PagingOnlyGroupUsers paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
