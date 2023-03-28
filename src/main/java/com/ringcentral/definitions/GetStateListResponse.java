package com.ringcentral.definitions;


public class GetStateListResponse {
    /**
     * Link to a states list resource
     * Format: uri
     */
    public String uri;
    /**
     * List of states
     */
    public GetStateInfoResponse[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
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
