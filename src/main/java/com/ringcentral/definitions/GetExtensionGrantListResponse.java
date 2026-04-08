package com.ringcentral.definitions;


public class GetExtensionGrantListResponse
{
    /**
     * Link to the list of extension grants
     * Format: uri
     */
    public String uri;
    public GetExtensionGrantListResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of extension grants with details
     * Required
     */
    public GrantInfo[] records;
    public GetExtensionGrantListResponse records(GrantInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     * Required
     */
    public PageNavigationModel navigation;
    public GetExtensionGrantListResponse navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     * Required
     */
    public EnumeratedPagingModel paging;
    public GetExtensionGrantListResponse paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}