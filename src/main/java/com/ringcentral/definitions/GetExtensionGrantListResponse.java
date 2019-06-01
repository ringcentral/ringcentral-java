package com.ringcentral.definitions;


public class GetExtensionGrantListResponse {
    /**
     * List of extension grants with details
     * Required
     */
    public GrantInfo[] records;
    /**
     * Information on navigation
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     * Required
     */
    public ProvisioningPagingInfo paging;

    public GetExtensionGrantListResponse records(GrantInfo[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionGrantListResponse navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionGrantListResponse paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
