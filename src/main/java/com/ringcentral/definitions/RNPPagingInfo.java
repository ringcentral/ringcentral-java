package com.ringcentral.definitions;


public class RNPPagingInfo {
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

    public RNPPagingInfo page(Long page) {
        this.page = page;
        return this;
    }

    public RNPPagingInfo totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public RNPPagingInfo perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public RNPPagingInfo totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public RNPPagingInfo pageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }

    public RNPPagingInfo pageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }
}
