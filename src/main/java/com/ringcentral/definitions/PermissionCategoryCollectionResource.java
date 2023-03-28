package com.ringcentral.definitions;


public class PermissionCategoryCollectionResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public PermissionCategoryResource[] records;
    /**
     *
     */
    public EnumeratedPagingModel paging;
    /**
     *
     */
    public PageNavigationModel navigation;

    public PermissionCategoryCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PermissionCategoryCollectionResource records(PermissionCategoryResource[] records) {
        this.records = records;
        return this;
    }

    public PermissionCategoryCollectionResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    public PermissionCategoryCollectionResource navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
