package com.ringcentral.definitions;


public class GetExtensionGrantListResponse {
    /**
     * Link to the list of extension grants
     * Format: uri
     */
    public String uri;
    /**
     * List of extension grants with details
     * Required
     */
    public GrantInfo[] records;
    /**
     * Required
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Required
     */
    public ProvisioningPagingInfo paging;

    public GetExtensionGrantListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

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
