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
    public PageNavigationModel navigation;
    /**
     * Required
     */
    public EnumeratedPagingModel paging;

    public GetExtensionGrantListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionGrantListResponse records(GrantInfo[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionGrantListResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionGrantListResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
