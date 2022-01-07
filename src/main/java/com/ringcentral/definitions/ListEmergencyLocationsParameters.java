package com.ringcentral.definitions;


// Query parameters for operation listEmergencyLocations
public class ListEmergencyLocationsParameters {
    /**
     * Filters entries containing the specified substring in address and name fields. The characters range is 0-64; not case-sensitive. If empty then the filter is ignored
     */
    public String searchString;
    /**
     * Internal identifier of a site for filtering. To filter by Main Site (Company) `main-site` value should be specified
     */
    public String siteId;
    /**
     * Enum: Valid, Invalid
     */
    public String addressStatus;
    /**
     * Enum: Active, Inactive
     */
    public String usageStatus;
    /**
     *
     */
    public String domesticCountryId;
    /**
     * Comma-separated list of fields to order results prefixed by plus sign &#039;+&#039; (ascending order) or minus sign &#039;-&#039; (descending order). The default value is `+address`
     * Default: +address
     * Enum: name, siteName, address, addressStatus, usageStatus
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

    public ListEmergencyLocationsParameters searchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public ListEmergencyLocationsParameters siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public ListEmergencyLocationsParameters addressStatus(String addressStatus) {
        this.addressStatus = addressStatus;
        return this;
    }

    public ListEmergencyLocationsParameters usageStatus(String usageStatus) {
        this.usageStatus = usageStatus;
        return this;
    }

    public ListEmergencyLocationsParameters domesticCountryId(String domesticCountryId) {
        this.domesticCountryId = domesticCountryId;
        return this;
    }

    public ListEmergencyLocationsParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public ListEmergencyLocationsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListEmergencyLocationsParameters page(Long page) {
        this.page = page;
        return this;
    }
}
