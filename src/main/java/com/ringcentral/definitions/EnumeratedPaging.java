package com.ringcentral.definitions;


public class EnumeratedPaging {
    /**
     * The current page number. 1-indexed, so the first page is 1
     * by default. May be omitted if result is empty (because non-existent page
     * was specified or perPage=0 was requested)
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 5
     */
    public Long page;
    /**
     * Current page size, describes how many items are in each page.
     * Matches &quot;perPage&quot; parameter from the request.
     * Required
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 50
     */
    public Long perPage;
    /**
     * The zero-based number of the first element on the current page. Omitted if the page is omitted or result is empty
     * Format: int32
     * Example: 1
     */
    public Long pageStart;
    /**
     * The zero-based index of the last element on the current page. Omitted if the page is omitted or result is empty
     * Format: int32
     * Example: 5
     */
    public Long pageEnd;
    /**
     * The total number of pages in a dataset. May be omitted for some resources due to performance reasons
     * Format: int32
     * Example: 25
     */
    public Long totalPages;
    /**
     * The total number of elements in a dataset. May be omitted for some resource due to performance reasons
     * Format: int32
     * Example: 25
     */
    public Long totalElements;

    public EnumeratedPaging page(Long page) {
        this.page = page;
        return this;
    }

    public EnumeratedPaging perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public EnumeratedPaging pageStart(Long pageStart) {
        this.pageStart = pageStart;
        return this;
    }

    public EnumeratedPaging pageEnd(Long pageEnd) {
        this.pageEnd = pageEnd;
        return this;
    }

    public EnumeratedPaging totalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }

    public EnumeratedPaging totalElements(Long totalElements) {
        this.totalElements = totalElements;
        return this;
    }
}
