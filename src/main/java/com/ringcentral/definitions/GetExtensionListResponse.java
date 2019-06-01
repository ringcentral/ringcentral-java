package com.ringcentral.definitions;


public class GetExtensionListResponse {
    /**
     * List of extensions with extension information
     * Required
     */
    public GetExtensionInfoResponse[] records;
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

    public GetExtensionListResponse records(GetExtensionInfoResponse[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionListResponse navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionListResponse paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
