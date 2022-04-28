package com.ringcentral.definitions;


/**
 * Query parameters for operation listDevicesAutomaticLocationUpdates
 */
public class ListDevicesAutomaticLocationUpdatesParameters {
    /**
     * Internal identifier of a site. To filter devices of Main Site (Company) `main-site` must be specified. Supported only If Multi-Site feature is enabled for the account
     */
    public String siteId;
    /**
     * Filters entries by their status of Automatic Location Updates feature
     */
    public Boolean featureEnabled;
    /**
     * Internal identifier of a device model for filtering. Multiple values are supported
     */
    public String model;
    /**
     * Filters devices which support HELD protocol
     */
    public Boolean compatibleOnly;
    /**
     * Filters entries which have device name or model name containing the mentioned substring. The value should be split by spaces; the range is 0 - 64 characters, not case-sensitive. If empty the filter is ignored
     */
    public String searchString;
    /**
     * Comma-separated list of fields to order results prefixed by plus sign &#039;+&#039; (ascending order) or minus sign &#039;-&#039; (descending order). Supported values: &#039;name&#039;, &#039;modelName&#039;, &#039;siteName&#039;, &#039;featureEnabled&#039;
     * Default: name
     */
    public String orderBy;
    /**
     * Indicates the page size (number of items). The values supported: `Max` or numeric value. If not specified, 100 records are returned per one page
     */
    public Long perPage;
    /**
     * Indicates the page number to retrieve. Only positive number values are supported
     * Default: 1
     */
    public Long page;

    public ListDevicesAutomaticLocationUpdatesParameters siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters featureEnabled(Boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters model(String model) {
        this.model = model;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters compatibleOnly(Boolean compatibleOnly) {
        this.compatibleOnly = compatibleOnly;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters searchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters page(Long page) {
        this.page = page;
        return this;
    }
}
