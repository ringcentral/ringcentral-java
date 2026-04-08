package com.ringcentral.definitions;


public class AutomaticLocationUpdatesUserList
{
    /**
     * Link to the users list resource
     * Format: uri
     */
    public String uri;
    public AutomaticLocationUpdatesUserList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public AutomaticLocationUpdatesUserInfo[] records;
    public AutomaticLocationUpdatesUserList records(AutomaticLocationUpdatesUserInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public AutomaticLocationUpdatesUserList navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public AutomaticLocationUpdatesUserList paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}