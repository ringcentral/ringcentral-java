package com.ringcentral.definitions;


public class PagingInfo {
    /**
     * Format: int32
     */
    public Long page;
    /**
     * Format: int32
     */
    public Long totalPages;
    /**
     * Format: int32
     */
    public Long perPage;
    /**
     * Format: int32
     */
    public Long totalElements;
    /**
     * Format: int32
     */
    public Long pageStart;
    /**
     * Format: int32
     */
    public Long pageEnd;

    public PagingInfo page(Long page) {
        this.page = page;
        return this;
    }

    public PagingInfo totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public PagingInfo perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public PagingInfo totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public PagingInfo pageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }

    public PagingInfo pageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }
}
