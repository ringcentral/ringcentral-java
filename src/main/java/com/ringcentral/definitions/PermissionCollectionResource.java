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
    public RNPPagingInfo paging;
    /**
     *
     */
    public RNPNavigationInfo navigation;

    public PermissionCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PermissionCollectionResource records(PermissionResource[] records) {
        this.records = records;
        return this;
    }

    public PermissionCollectionResource paging(RNPPagingInfo paging) {
        this.paging = paging;
        return this;
    }

    public PermissionCollectionResource navigation(RNPNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
