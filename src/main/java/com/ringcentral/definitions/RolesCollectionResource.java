package com.ringcentral.definitions;


public class RolesCollectionResource
{
    /**
     * Format: uri
     */
    public String uri;
    public RolesCollectionResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public RoleResource[] records;
    public RolesCollectionResource records(RoleResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public RNPPagingInfo paging;
    public RolesCollectionResource paging(RNPPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public RNPNavigationInfo navigation;
    public RolesCollectionResource navigation(RNPNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }
}