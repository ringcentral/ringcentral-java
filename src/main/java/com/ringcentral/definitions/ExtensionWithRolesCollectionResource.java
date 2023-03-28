package com.ringcentral.definitions;


public class ExtensionWithRolesCollectionResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public ExtensionWithRolesResource[] records;
    /**
     *
     */
    public EnumeratedPagingModel paging;
    /**
     *
     */
    public PageNavigationModel navigation;

    public ExtensionWithRolesCollectionResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionWithRolesCollectionResource records(ExtensionWithRolesResource[] records) {
        this.records = records;
        return this;
    }

    public ExtensionWithRolesCollectionResource paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }

    public ExtensionWithRolesCollectionResource navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }
}
