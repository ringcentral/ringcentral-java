package com.ringcentral.definitions;


public class RNPPagingInfo
{
    /**
     * Format: int32
     */
    public Long page;
    public RNPPagingInfo page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Format: int32
     */
    public Long totalPages;
    public RNPPagingInfo totalPages(Long totalPages)
    {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Format: int32
     */
    public Long perPage;
    public RNPPagingInfo perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Format: int32
     */
    public Long totalElements;
    public RNPPagingInfo totalElements(Long totalElements)
    {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * Format: int32
     */
    public Long pageStart;
    public RNPPagingInfo pageStart(Long pageStart)
    {
        this.pageStart = pageStart;
        return this;
    }

    /**
     * Format: int32
     */
    public Long pageEnd;
    public RNPPagingInfo pageEnd(Long pageEnd)
    {
        this.pageEnd = pageEnd;
        return this;
    }
}