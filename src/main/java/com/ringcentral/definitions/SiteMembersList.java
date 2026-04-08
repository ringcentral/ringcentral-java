package com.ringcentral.definitions;


public class SiteMembersList
{
    /**
     * Link to a site members list resource
     * Format: uri
     */
    public String uri;
    public SiteMembersList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public SiteMemberInfo[] records;
    public SiteMembersList records(SiteMemberInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public SiteMembersList navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public SiteMembersList paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}