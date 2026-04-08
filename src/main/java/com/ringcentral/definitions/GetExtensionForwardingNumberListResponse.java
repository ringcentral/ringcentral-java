package com.ringcentral.definitions;


public class GetExtensionForwardingNumberListResponse
{
    /**
     * Link to the forwarding number list resource
     * Format: uri
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
    public PageNavigationModel navigation;
    public GetExtensionForwardingNumberListResponse navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public GetExtensionForwardingNumberListResponse paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}