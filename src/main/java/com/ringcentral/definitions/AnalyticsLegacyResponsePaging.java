package com.ringcentral.definitions;


public class AnalyticsLegacyResponsePaging
{
    /**
     * The current page number
     * Required
     * Format: int64
     */
    public Long page;
    public AnalyticsLegacyResponsePaging page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * How many items are displayed on the page
     * Required
     * Format: int64
     */
    public Long perPage;
    public AnalyticsLegacyResponsePaging perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * The total number of pages
     * Required
     * Format: int64
     */
    public Long totalPages;
    public AnalyticsLegacyResponsePaging totalPages(Long totalPages)
    {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * The total number of items in the dataset
     * Required
     * Format: int64
     */
    public Long totalElements;
    public AnalyticsLegacyResponsePaging totalElements(Long totalElements)
    {
        this.totalElements = totalElements;
        return this;
    }
}