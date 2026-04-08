package com.ringcentral.definitions;

public class RolesCollectionResource {
    /** Format: uri */
    public String uri;

    public RolesCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** */
    public RoleResource[] records;

    public RolesCollectionResource records(RoleResource[] records) {
        this.records = records;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public RolesCollectionResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public RolesCollectionResource navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
