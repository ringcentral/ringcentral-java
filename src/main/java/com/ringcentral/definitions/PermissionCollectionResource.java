package com.ringcentral.definitions;


public class PermissionCollectionResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public PermissionResource[] records;
    /**
     *
     */
    public EnumeratedPagingModel paging;
    /**
     *
     */
    public PageNavigationModel navigation;

    public PermissionCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PermissionCollectionResource records(PermissionResource[] records) {
        this.records = records;
        return this;
    }

    public PermissionCollectionResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    public PermissionCollectionResource navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
