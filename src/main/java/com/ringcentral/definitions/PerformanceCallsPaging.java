package com.ringcentral.definitions;


public class PerformanceCallsPaging {
    /**
     * The current page number
     * Required
     * Format: int64
     */
    public Long page;
    /**
     * The number of items displayed per page
     * Required
     * Format: int64
     */
    public Long perPage;
    /**
     * The total number of pages
     * Required
     * Format: int64
     */
    public Long totalPages;
    /**
     * The total number of items in the dataset
     * Required
     * Format: int64
     */
    public Long totalElements;

    public PerformanceCallsPaging page(Long page) {
        this.page = page;
        return this;
    }

    public PerformanceCallsPaging perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public PerformanceCallsPaging totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public PerformanceCallsPaging totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
}
