package com.ringcentral.definitions;


public class GetExtensionForwardingNumberListResponse {
    /**
     * Link to the forwarding number list resource
     */
    public String uri;
    /**
     * List of forwarding phone numbers
     */
    public ForwardingNumberInfo[] records;
    /**
     *
     */
    public NavigationInfo navigation;
    /**
     *
     */
    public EnumeratedPaging paging;

    public GetExtensionForwardingNumberListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionForwardingNumberListResponse records(ForwardingNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionForwardingNumberListResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionForwardingNumberListResponse paging(EnumeratedPaging paging) {
        this.paging = paging;
        return this;
    }
}
