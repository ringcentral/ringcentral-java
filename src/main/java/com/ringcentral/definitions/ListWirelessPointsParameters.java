package com.ringcentral.definitions;


public class ListWirelessPointsParameters
{
    /**
         * Internal identifier of a site. To filter Main Site (Company) 'main-site' must be specified. Supported only If multi-site feature is enabled for the account
         */
        public String siteId;
  public ListWirelessPointsParameters siteId(String siteId)
  {
    this.siteId = siteId;
    return this;
  }
  

        /**
         * Filters entries by the specified substring (search by chassis ID, switch name or address) The characters range is 0-64 (if empty the filter is ignored)
         */
        public String searchString;
  public ListWirelessPointsParameters searchString(String searchString)
  {
    this.searchString = searchString;
    return this;
  }
  

        /**
         * Comma-separated list of fields to order results prefixed by '+' sign (ascending order) or '-' sign (descending order). The default sorting is by `name`
         */
        public String orderBy;
  public ListWirelessPointsParameters orderBy(String orderBy)
  {
    this.orderBy = orderBy;
    return this;
  }
  

        /**
         * Indicates the page size (number of items). The values supported: `Max` or numeric value. If not specified, 100 records are returned per one page
         */
        public Long perPage;
  public ListWirelessPointsParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are supported
         * Default: 1
         */
        public Long page;
  public ListWirelessPointsParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  
}
