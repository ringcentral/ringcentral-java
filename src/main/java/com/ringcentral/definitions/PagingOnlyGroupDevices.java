package com.ringcentral.definitions;


public class PagingOnlyGroupDevices
{
    /**
     * Link to a list of devices assigned to the paging only group
     * Format: uri
     */
    public String uri;
    public PagingOnlyGroupDevices uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of paging devices assigned to this group
     */
    public PagingDeviceInfo[] records;
    public PagingOnlyGroupDevices records(PagingDeviceInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public PagingOnlyGroupDevices navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public PagingOnlyGroupDevices paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}