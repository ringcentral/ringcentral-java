package com.ringcentral.definitions;


public class RolesCollectionResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public RoleResource[] records;
    /**
     *
     */
    public RNPPagingInfo paging;
    /**
     *
     */
    public RNPNavigationInfo navigation;

    public RolesCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public RolesCollectionResource records(RoleResource[] records) {
        this.records = records;
        return this;
    }

    public RolesCollectionResource paging(RNPPagingInfo paging) {
        this.paging = paging;
        return this;
    }

    public RolesCollectionResource navigation(RNPNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
