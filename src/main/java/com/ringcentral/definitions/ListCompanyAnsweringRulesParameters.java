package com.ringcentral.definitions;


    /**
* Query parameters for operation listCompanyAnsweringRules
*/
public class ListCompanyAnsweringRulesParameters
{
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    public ListCompanyAnsweringRulesParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Indicates the page size (number of items per page)
     * Default: 100
     */
    public Long perPage;
    public ListCompanyAnsweringRulesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}