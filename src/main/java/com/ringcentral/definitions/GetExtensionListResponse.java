package com.ringcentral.definitions;


public class GetExtensionListResponse {
    /**
     * Link to an extension list resource
     * Format: uri
     */
    public String uri;
    /**
     * List of extensions with extension information
     * Required
     */
    public GetExtensionListInfoResponse[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public GetExtensionListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionListResponse records(GetExtensionListInfoResponse[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionListResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionListResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
