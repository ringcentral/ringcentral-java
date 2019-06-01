package com.ringcentral.definitions;


public class ListFaxCoverPagesResponse {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public FaxCoverPageInfo[] records;
    /**
     * Information on navigation
     */
    public MessagingNavigationInfo navigation;
    /**
     * Information on paging
     */
    public MessagingPagingInfo paging;

    public ListFaxCoverPagesResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ListFaxCoverPagesResponse records(FaxCoverPageInfo[] records) {
        this.records = records;
        return this;
    }

    public ListFaxCoverPagesResponse navigation(MessagingNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public ListFaxCoverPagesResponse paging(MessagingPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
