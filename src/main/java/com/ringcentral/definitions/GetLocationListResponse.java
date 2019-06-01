package com.ringcentral.definitions;


public class GetLocationListResponse {
    /**
     * List of locations
     */
    public LocationInfo[] records;
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

    public GetLocationListResponse records(LocationInfo[] records) {
        this.records = records;
        return this;
    }

    public GetLocationListResponse navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetLocationListResponse paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
