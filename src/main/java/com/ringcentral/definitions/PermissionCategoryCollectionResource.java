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
    public EnumeratedPagingModel paging;
    public PermissionCategoryCollectionResource paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public PermissionCategoryCollectionResource navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }
}