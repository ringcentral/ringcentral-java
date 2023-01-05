package com.ringcentral.definitions;


    /**
* Query parameters for operation listCompanyAnsweringRules
*/
public class ListCompanyAnsweringRulesParameters
{
    /**
     * The number of the result set page to display
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    public ListCompanyAnsweringRulesParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * The number of items per page. If provided value in the request
    * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    public ListCompanyAnsweringRulesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}