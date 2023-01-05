package com.ringcentral.definitions;


public class GetStateListResponse
{
    /**
     * Link to a states list resource
     * Format: uri
     */
    public String uri;
    public GetStateListResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of states
     */
    public GetStateInfoResponse[] records;
    public GetStateListResponse records(GetStateInfoResponse[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public ProvisioningNavigationInfo navigation;
    public GetStateListResponse navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public ProvisioningPagingInfo paging;
    public GetStateListResponse paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}