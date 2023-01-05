package com.ringcentral.definitions;


public class GetExtensionForwardingNumberListResponse
{
    /**
     * Link to the forwarding number list resource
     */
    public String uri;
    public GetExtensionForwardingNumberListResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of forwarding phone numbers
     */
    public ForwardingNumberInfo[] records;
    public GetExtensionForwardingNumberListResponse records(ForwardingNumberInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public NavigationInfo navigation;
    public GetExtensionForwardingNumberListResponse navigation(NavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPaging paging;
    public GetExtensionForwardingNumberListResponse paging(EnumeratedPaging paging)
    {
        this.paging = paging;
        return this;
    }
}