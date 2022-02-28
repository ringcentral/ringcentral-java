package com.ringcentral.definitions;


public class ResponsePaging {
    /**
     * The current page number
     * Required
     * Format: int64
     */
    public Long page;
    /**
     * How many items are displayed on the page
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

    public ResponsePaging page(Long page) {
        this.page = page;
        return this;
    }

    public ResponsePaging perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ResponsePaging totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public ResponsePaging totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
}
