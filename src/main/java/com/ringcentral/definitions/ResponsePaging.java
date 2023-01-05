package com.ringcentral.definitions;


    /**
* Paging information
*/
public class ResponsePaging
{
    /**
     * The current page number
     * Required
     * Format: int64
     */
    public Long page;
    public ResponsePaging page(Long page)
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
    public ResponsePaging perPage(Long perPage)
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
    public ResponsePaging totalPages(Long totalPages)
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
    public ResponsePaging totalElements(Long totalElements)
    {
        this.totalElements = totalElements;
        return this;
    }
}