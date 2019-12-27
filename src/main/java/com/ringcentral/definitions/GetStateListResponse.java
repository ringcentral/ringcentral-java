package com.ringcentral.definitions;


public class GetStateListResponse {
    /**
     * Link to the states list resource
     * Required
     */
    public String uri;
    /**
     * List of states
     * Required
     */
    public GetStateInfoResponse[] records;
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

    public GetStateListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetStateListResponse records(GetStateInfoResponse[] records) {
        this.records = records;
        return this;
    }

    public GetStateListResponse navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetStateListResponse paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
