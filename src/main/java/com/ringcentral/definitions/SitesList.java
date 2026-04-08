package com.ringcentral.definitions;


public class SitesList
{
    /**
     * Link to a sites resource
     * Format: uri
     */
    public String uri;
    public SitesList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public SiteInfo[] records;
    public SitesList records(SiteInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public SitesList navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public SitesList paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}