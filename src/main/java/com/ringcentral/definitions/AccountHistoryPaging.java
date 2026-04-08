package com.ringcentral.definitions;


public class AccountHistoryPaging
{
    /**
     * The current page number. 1-indexed, so the first page is 1 by default. May be omitted if result is empty
    * (because non-existent page was specified or perPage=0 was requested)
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     */
    public Long page;
    public AccountHistoryPaging page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Current page size, describes how many items are in each page. Matches &quot;perPage&quot; parameter from the request
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 50
     */
    public Long perPage;
    public AccountHistoryPaging perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Total number of pages in a dataset. May be omitted for some resources due to performance reasons
     * Format: int32
     * Example: 25
     */
    public Long total;
    public AccountHistoryPaging total(Long total)
    {
        this.total = total;
        return this;
    }

    /**
     * Total number of elements in a dataset. May be omitted for some resources due to performance reasons
     * Format: int32
     * Example: 25
     */
    public Long totalFound;
    public AccountHistoryPaging totalFound(Long totalFound)
    {
        this.totalFound = totalFound;
        return this;
    }
}