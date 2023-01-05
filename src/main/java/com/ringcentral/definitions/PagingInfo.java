package com.ringcentral.definitions;


public class PagingInfo
{
    /**
     * Format: int32
     */
    public Long page;
    public PagingInfo page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Format: int32
     */
    public Long totalPages;
    public PagingInfo totalPages(Long totalPages)
    {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Format: int32
     */
    public Long perPage;
    public PagingInfo perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Format: int32
     */
    public Long totalElements;
    public PagingInfo totalElements(Long totalElements)
    {
        this.totalElements = totalElements;
        return this;
    }

    /**
     * Format: int32
     */
    public Long pageStart;
    public PagingInfo pageStart(Long pageStart)
    {
        this.pageStart = pageStart;
        return this;
    }

    /**
     * Format: int32
     */
    public Long pageEnd;
    public PagingInfo pageEnd(Long pageEnd)
    {
        this.pageEnd = pageEnd;
        return this;
    }
}