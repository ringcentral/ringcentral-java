package com.ringcentral.definitions;


public class GetExtensionForwardingNumberListResponse {
    /**
     * List of forwarding phone numbers
     */
    public ForwardingNumberInfo[] records;
    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;
    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;

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
