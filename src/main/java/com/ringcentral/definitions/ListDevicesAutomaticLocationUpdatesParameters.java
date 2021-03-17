package com.ringcentral.definitions;


public class ListDevicesAutomaticLocationUpdatesParameters
{
    /**
         * Internal identifier of a site. To filter devices of Main Site (Company) `main-site` must be specified. Supported only If Multi-Site feature is enabled for the account
         */
        public String siteId;
  public ListDevicesAutomaticLocationUpdatesParameters siteId(String siteId)
  {
    this.siteId = siteId;
    return this;
  }
  

        /**
         * Filters entries by their status of Automatic Location Updates feature
         */
        public Boolean featureEnabled;
  public ListDevicesAutomaticLocationUpdatesParameters featureEnabled(Boolean featureEnabled)
  {
    this.featureEnabled = featureEnabled;
    return this;
  }
  

        /**
         * Internal identifier of a device model for filtering. Multiple values are supported
         */
        public String model;
  public ListDevicesAutomaticLocationUpdatesParameters model(String model)
  {
    this.model = model;
    return this;
  }
  

        /**
         * Filters devices which support HELD protocol
         */
        public Boolean compatibleOnly;
  public ListDevicesAutomaticLocationUpdatesParameters compatibleOnly(Boolean compatibleOnly)
  {
    this.compatibleOnly = compatibleOnly;
    return this;
  }
  

        /**
         * Filters entries which have device name or model name containing the mentioned substring. The value should be split by spaces; the range is 0 - 64 characters, not case-sensitive. If empty the filter is ignored
         */
        public String searchString;
  public ListDevicesAutomaticLocationUpdatesParameters searchString(String searchString)
  {
    this.searchString = searchString;
    return this;
  }
  

        /**
         * Comma-separated list of fields to order results prefixed by plus sign '+' (ascending order) or minus sign '-' (descending order). Supported values: 'name', 'modelName', 'siteName', 'featureEnabled'
         * Default: name
         */
        public String orderBy;
  public ListDevicesAutomaticLocationUpdatesParameters orderBy(String orderBy)
  {
    this.orderBy = orderBy;
    return this;
  }
  

        /**
         * Indicates the page size (number of items). The values supported: `Max` or numeric value. If not specified, 100 records are returned per one page
         */
        public Long perPage;
  public ListDevicesAutomaticLocationUpdatesParameters perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  

        /**
         * Indicates the page number to retrieve. Only positive number values are supported
         * Default: 1
         */
        public Long page;
  public ListDevicesAutomaticLocationUpdatesParameters page(Long page)
  {
    this.page = page;
    return this;
  }
  
}
