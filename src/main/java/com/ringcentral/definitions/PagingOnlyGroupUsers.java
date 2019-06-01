package com.ringcentral.definitions;


public class PagingOnlyGroupUsers {
    /**
     * List of users allowed to page this group
     */
    public PagingGroupExtensionInfo[] records;
    /**
     * Information on navigation
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     */
    public ProvisioningPagingInfo paging;

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
