package com.ringcentral.definitions;


    /**
* Information on paging
*/
public class UserContactsPagingInfo
{
    /**
     * Current page number. 1-indexed, so the first page is 1
    * by default. May be omitted if the result is empty (because non-existent page
    * was specified or perPage=0 was requested)
     * Format: int32
     */
    public Long page;
    public UserContactsPagingInfo page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Current page size, describes how many items each page contains.
    * Default value is 100. Maximum value is 1000. If perPage value in the request
    * is greater than 1000, the maximum value (1000) is applied
     * Format: int32
     */
    public Long perPage;
    public UserContactsPagingInfo perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Zero-based number of the first element on the current page.
    * Omitted if a page is omitted or the result is empty
     * Format: int32
     */
    public Long pageStart;
    public UserContactsPagingInfo pageStart(Long pageStart)
    {
        this.pageStart = pageStart;
        return this;
    }

    /**
     * Zero-based index of the last element on the current page.
    * Omitted if a page is omitted or the result is empty
     * Format: int32
     */
    public Long pageEnd;
    public UserContactsPagingInfo pageEnd(Long pageEnd)
    {
        this.pageEnd = pageEnd;
        return this;
    }

    /**
     * Total number of pages in a dataset. May be omitted for
    * some resources due to performance reasons
     * Format: int32
     */
    public Long totalPages;
    public UserContactsPagingInfo totalPages(Long totalPages)
    {
        this.totalPages = totalPages;
        return this;
    }

    /**
     * Total number of elements in a dataset. May be omitted for
    * some resource due to performance reasons
     * Format: int32
     */
    public Long totalElements;
    public UserContactsPagingInfo totalElements(Long totalElements)
    {
        this.totalElements = totalElements;
        return this;
    }
}