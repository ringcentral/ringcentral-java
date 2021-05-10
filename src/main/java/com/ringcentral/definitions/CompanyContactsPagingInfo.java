package com.ringcentral.definitions;


public class CompanyContactsPagingInfo {
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

    public CompanyContactsPagingInfo page(Long page) {
        this.page = page;
        return this;
    }

    public CompanyContactsPagingInfo totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public CompanyContactsPagingInfo perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public CompanyContactsPagingInfo totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }

    public CompanyContactsPagingInfo pageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }

    public CompanyContactsPagingInfo pageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }
}
