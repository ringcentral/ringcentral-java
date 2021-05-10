package com.ringcentral.definitions;


// Query parameters for operation listAutomaticLocationUpdatesUsers
public class ListAutomaticLocationUpdatesUsersParameters {
    /**
     * Extension type. Multiple values are supported
     * Enum: User, Limited
     */
    public String type;
    /**
     * Filters entries containing the specified substring in user name, extension or department. The characters range is 0-64; not case-sensitive. If empty then the filter is ignored
     */
    public String searchString;
    /**
     * Department name to filter the users. The value range is 0-64; not case-sensitive. If not specified then the parameter is ignored. Multiple values are supported
     */
    public String department;
    /**
     * Internal identifier of a site. To filter users of Main Site (Company) `main-site` must be specified. Supported only If Multi-Site feature is enabled for the account. Multiple values are supported
     */
    public String siteId;
    /**
     * Filters entries by their status of Automatic Location Updates feature
     */
    public Boolean featureEnabled;
    /**
     * Comma-separated list of fields to order results prefixed by plus sign '+' (ascending order) or minus sign '-' (descending order). Supported values: 'name', 'modelName', 'siteName', 'featureEnabled'
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

    public ListAutomaticLocationUpdatesUsersParameters type(String type) {
        this.type = type;
        return this;
    }

    public ListAutomaticLocationUpdatesUsersParameters searchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public ListAutomaticLocationUpdatesUsersParameters department(String department) {
        this.department = department;
        return this;
    }

    public ListAutomaticLocationUpdatesUsersParameters siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public ListAutomaticLocationUpdatesUsersParameters featureEnabled(Boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
        return this;
    }

    public ListAutomaticLocationUpdatesUsersParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public ListAutomaticLocationUpdatesUsersParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListAutomaticLocationUpdatesUsersParameters page(Long page) {
        this.page = page;
        return this;
    }
}
