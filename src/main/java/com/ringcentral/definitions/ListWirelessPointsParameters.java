package com.ringcentral.definitions;


    /**
* Query parameters for operation listWirelessPoints
*/
public class ListWirelessPointsParameters
{
    /**
     * Internal identifier of a site for filtering. To indicate company main
    * site `main-site` value should be specified. Supported only if multi-site feature
    * is enabled for the account. Multiple values are supported.
     */
    public String[] siteId;
    public ListWirelessPointsParameters siteId(String[] siteId)
    {
        this.siteId = siteId;
        return this;
    }

    /**
     * Filters entries by the specified substring (search by chassis
    * ID, switch name or address) The characters range is 0-64 (if empty the filter
    * is ignored)
     */
    public String searchString;
    public ListWirelessPointsParameters searchString(String searchString)
    {
        this.searchString = searchString;
        return this;
    }

    /**
     * Comma-separated list of fields to order results prefixed by &#039;+&#039;
    * sign (ascending order) or &#039;-&#039; sign (descending order).The default sorting
    * is by `name`
     */
    public String orderBy;
    public ListWirelessPointsParameters orderBy(String orderBy)
    {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * Indicates a page size (number of items). The values supported:
    * `Max` or numeric value. If not specified, 100 records are returned per one
    * page
     * Format: int32
     */
    public Long perPage;
    public ListWirelessPointsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Indicates the page number to retrieve. Only positive number values
    * are supported
     * Format: int32
     * Default: 1
     */
    public Long page;
    public ListWirelessPointsParameters page(Long page)
    {
        this.page = page;
        return this;
    }
}