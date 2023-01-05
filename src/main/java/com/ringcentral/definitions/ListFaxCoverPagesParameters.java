package com.ringcentral.definitions;


    /**
* Query parameters for operation listFaxCoverPages
*/
public class ListFaxCoverPagesParameters
{
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    public ListFaxCoverPagesParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    public ListFaxCoverPagesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}