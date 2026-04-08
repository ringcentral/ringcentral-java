package com.ringcentral.definitions;


    /**
* Query parameters for operation listCallQueueMembers
*/
public class ListCallQueueMembersParameters
{
    /**
     * Indicates a page number to retrieve. Only positive number values
    * are allowed
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListCallQueueMembersParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    public ListCallQueueMembersParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}