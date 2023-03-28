package com.ringcentral.definitions;


public class ListFaxCoverPagesResponse {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public FaxCoverPageInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public ListFaxCoverPagesResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ListFaxCoverPagesResponse records(FaxCoverPageInfo[] records) {
        this.records = records;
        return this;
    }

    public ListFaxCoverPagesResponse navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public ListFaxCoverPagesResponse paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
