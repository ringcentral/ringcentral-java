package com.ringcentral.definitions;


public class PermissionCollectionResource
{
    /**
     * Format: uri
     */
    public String uri;
    public PermissionCollectionResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public PermissionResource[] records;
    public PermissionCollectionResource records(PermissionResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public RNPPagingInfo paging;
    public PermissionCollectionResource paging(RNPPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public RNPNavigationInfo navigation;
    public PermissionCollectionResource navigation(RNPNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }
}