package com.ringcentral.definitions;


public class GetLocationListResponse {
    /**
     * Link to the location list resource
     * Format: uri
     */
    public String uri;
    /**
     * List of locations
     */
    public LocationInfo[] records;
    /**
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Required
     */
    public ProvisioningPagingInfo paging;

    public GetLocationListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

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
