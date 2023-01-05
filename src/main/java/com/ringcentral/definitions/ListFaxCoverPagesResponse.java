package com.ringcentral.definitions;


public class ListFaxCoverPagesResponse
{
    /**
     */
    public String uri;
    public ListFaxCoverPagesResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public FaxCoverPageInfo[] records;
    public ListFaxCoverPagesResponse records(FaxCoverPageInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public MessagingNavigationInfo navigation;
    public ListFaxCoverPagesResponse navigation(MessagingNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public MessagingPagingInfo paging;
    public ListFaxCoverPagesResponse paging(MessagingPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}