package com.ringcentral.definitions;

public class ExtensionWithRolesCollectionResource {
    /** Format: uri */
    public String uri;

    public ExtensionWithRolesCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** */
    public ExtensionWithRolesResource[] records;

    public ExtensionWithRolesCollectionResource records(ExtensionWithRolesResource[] records) {
        this.records = records;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public ExtensionWithRolesCollectionResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public ExtensionWithRolesCollectionResource navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
