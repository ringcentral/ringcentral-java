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
    public CallHandlingNavigationInfo navigation;
    /**
     *
     */
    public CallHandlingPagingInfo paging;

    public GetExtensionForwardingNumberListResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetExtensionForwardingNumberListResponse records(ForwardingNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public GetExtensionForwardingNumberListResponse navigation(CallHandlingNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public GetExtensionForwardingNumberListResponse paging(CallHandlingPagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
