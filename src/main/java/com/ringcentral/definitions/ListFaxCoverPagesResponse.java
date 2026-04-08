package com.ringcentral.definitions;


public class ListFaxCoverPagesResponse
{
    /**
     * Format: uri
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
    public PageNavigationModel navigation;
    public ListFaxCoverPagesResponse navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public ListFaxCoverPagesResponse paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}