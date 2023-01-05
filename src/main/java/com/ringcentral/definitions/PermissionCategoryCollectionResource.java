package com.ringcentral.definitions;


public class PermissionCategoryCollectionResource
{
    /**
     * Format: uri
     */
    public String uri;
    public PermissionCategoryCollectionResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public PermissionCategoryResource[] records;
    public PermissionCategoryCollectionResource records(PermissionCategoryResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public RNPPagingInfo paging;
    public PermissionCategoryCollectionResource paging(RNPPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public RNPNavigationInfo navigation;
    public PermissionCategoryCollectionResource navigation(RNPNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }
}