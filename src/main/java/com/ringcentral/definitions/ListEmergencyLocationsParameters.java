package com.ringcentral.definitions;


public class ListEmergencyLocationsParameters
{
    /**
         * Filters entries containing the specified substring in address and name fields. The characters range is 0-64; not case-sensitive. If empty then the filter is ignored
         */
        public String searchString;
  public ListEmergencyLocationsParameters searchString(String searchString)
  {
    this.searchString = searchString;
    return this;
  }
  

        /**
         * Internal identifier of a site for filtering. To filter by Main Site (Company) `main-site` value should be specified
         */
        public String siteId;
  public ListEmergencyLocationsParameters siteId(String siteId)
  {
    this.siteId = siteId;
    return this;
  }
  

        /**
         * Enum: Valid, Invalid
         */
        public String addressStatus;
  public ListEmergencyLocationsParameters addressStatus(String addressStatus)
  {
    this.addressStatus = addressStatus;
    return this;
  }
  

        /**
         * Enum: Active, Inactive
         */
        public String usageStatus;
  public ListEmergencyLocationsParameters usageStatus(String usageStatus)
  {
    this.usageStatus = usageStatus;
    return this;
  }
  

        /**
         */
        public String domesticCountryId;
  public ListEmergencyLocationsParameters domesticCountryId(String domesticCountryId)
  {
    this.domesticCountryId = domesticCountryId;
    return this;
  }
  

        /**
         * Comma-separated list of fields to order results prefixed by plus sign '+' (ascending order) or minus sign '-' (descending order). Supported values: 'address'
         * Default: address
         */
        public String orderBy;
  public ListEmergencyLocationsParameters orderBy(String orderBy)
  {
    this.orderBy = orderBy;
    return this;
  }
  

        /**
         * Indicates the page size (number of items). The values supported: `Max` or numeric value. If not specified, 100 records are returned per one page
         */
        public Long perPage;
  public ListEmergencyLocationsParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are supported
         * Default: 1
         */
        public Long page;
  public ListEmergencyLocationsParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  
}
