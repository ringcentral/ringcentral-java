package com.ringcentral.definitions;


public class GetExtensionForwardingNumberListResponse {
    /**
     * Link to the forwarding number list resource
     * Format: uri
     */
    public String uri;
    /**
     * List of forwarding phone numbers
     */
    public ForwardingNumberInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public GetExtensionForwardingNumberListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionForwardingNumberListResponse records(ForwardingNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionForwardingNumberListResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionForwardingNumberListResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
