package com.ringcentral.definitions;


/**
 * Query parameters for operation listCallMonitoringGroups
 */
public class ListCallMonitoringGroupsParameters {
    /**
     * Indicates a page number to retrieve. Only positive number values
     * are allowed
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    /**
     * Internal identifier of an extension that is a member of every
     * group within the result
     */
    public String memberExtensionId;
    /**
     * Internal identifier of a site
     */
    public String[] siteId;

    public ListCallMonitoringGroupsParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListCallMonitoringGroupsParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListCallMonitoringGroupsParameters memberExtensionId(String memberExtensionId) {
        this.memberExtensionId = memberExtensionId;
        return this;
    }

    public ListCallMonitoringGroupsParameters siteId(String[] siteId) {
        this.siteId = siteId;
        return this;
    }
}
