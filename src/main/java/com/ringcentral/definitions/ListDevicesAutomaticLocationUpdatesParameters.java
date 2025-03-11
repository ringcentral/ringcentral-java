package com.ringcentral.definitions;


/**
 * Query parameters for operation listDevicesAutomaticLocationUpdates
 */
public class ListDevicesAutomaticLocationUpdatesParameters {
    /**
     * Internal identifier of a site for filtering. To indicate company main
     * site `main-site` value should be specified. Supported only if multi-site feature
     * is enabled for the account. Multiple values are supported.
     */
    public String[] siteId;
    /**
     * Filters entries by their status of Automatic Location Updates
     * feature
     */
    public Boolean featureEnabled;
    /**
     * Internal identifier of a device model for filtering. Multiple
     * values are supported
     */
    public String modelId;
    /**
     * Filters devices which support HELD protocol
     */
    public Boolean compatibleOnly;
    /**
     * Filters entries which have device name or model name containing
     * the mentioned substring. The value should be split by spaces; the range
     * is 0 - 64 characters, not case-sensitive. If empty the filter is ignored
     */
    public String searchString;
    /**
     * Comma-separated list of fields to order results prefixed by plus sign &#039;+&#039; (ascending order),
     * or minus sign &#039;-&#039; (descending order).
     * Supported values: &#039;name&#039;, &#039;modelName&#039;, &#039;siteName&#039;, &#039;featureEnabled&#039;.
     * The default sorting is by `name`
     */
    public String[] orderBy;
    /**
     * Indicates a page size (number of items). The values supported:
     * `Max` or numeric value. If not specified, 100 records are returned per one
     * page
     * Format: int32
     */
    public Long perPage;
    /**
     * Indicates a page number to retrieve. Only positive number values
     * are supported
     * Format: int32
     * Default: 1
     */
    public Long page;

    public ListDevicesAutomaticLocationUpdatesParameters siteId(String[] siteId) {
        this.siteId = siteId;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters featureEnabled(Boolean featureEnabled) {
        this.featureEnabled = featureEnabled;
        return this;
    }

    public ListDevicesAutomaticLocationUpdatesParameters modelId(String modelId) {
        this.modelId = modelId;
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

    public ListDevicesAutomaticLocationUpdatesParameters orderBy(String[] orderBy) {
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
