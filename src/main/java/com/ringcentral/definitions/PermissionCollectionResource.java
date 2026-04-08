package com.ringcentral.definitions;

public class PermissionCollectionResource {
    /** Format: uri */
    public String uri;

    public PermissionCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** */
    public PermissionResource[] records;

    public PermissionCollectionResource records(PermissionResource[] records) {
        this.records = records;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public PermissionCollectionResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public PermissionCollectionResource navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
