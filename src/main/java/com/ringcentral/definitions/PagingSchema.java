package com.ringcentral.definitions;


public class PagingSchema {
    /**
     * Required
     * Format: int32
     * Example: 2
     */
    public Long page;
    /**
     * Required
     * Format: int32
     * Example: 10
     */
    public Long totalPages;
    /**
     * Required
     * Format: int32
     * Example: 5
     */
    public Long perPage;

    public PagingSchema page(Long page) {
        this.page = page;
        return this;
    }

    public PagingSchema totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public PagingSchema perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
