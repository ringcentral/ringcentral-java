package com.ringcentral.definitions;


public class PagingOnlyGroupUsers {
    /**
     * Link to a list of users allowed to page the Paging Only group
     * Format: uri
     */
    public String uri;
    /**
     * List of users allowed to page the Paging Only group
     */
    public PagingGroupExtensionInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public PagingOnlyGroupUsers uri(String uri) {
        this.uri = uri;
        return this;
    }

    public PagingOnlyGroupUsers records(PagingGroupExtensionInfo[] records) {
        this.records = records;
        return this;
    }

    public PagingOnlyGroupUsers navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public PagingOnlyGroupUsers paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
