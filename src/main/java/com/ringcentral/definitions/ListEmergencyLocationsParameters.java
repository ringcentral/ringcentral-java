package com.ringcentral.definitions;


public class ListEmergencyLocationsParameters {
    /**
     * Filters entries containing the specified substring in address fields. The characters range is 0-64; not case-sensitive. If empty then the filter is ignored
     */
    public String searchString;
    /**
     * Comma-separated list of fields to order results prefixed by plus sign '+' (ascending order) or minus sign '-' (descending order). Supported values: 'address'
     * Default: address
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
