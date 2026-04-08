package com.ringcentral.definitions;

public class PagingOnlyGroupUsers {
    /** Link to a list of users allowed to page the Paging Only group Format: uri */
    public String uri;

    public PagingOnlyGroupUsers uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of users allowed to page the Paging Only group */
    public PagingGroupExtensionInfo[] records;

    public PagingOnlyGroupUsers records(PagingGroupExtensionInfo[] records) {
        this.records = records;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public PagingOnlyGroupUsers navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public PagingOnlyGroupUsers paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
