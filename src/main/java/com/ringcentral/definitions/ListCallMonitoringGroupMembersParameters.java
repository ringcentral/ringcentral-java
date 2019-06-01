package com.ringcentral.definitions;


public class ListCallMonitoringGroupMembersParameters {
    /**
     * Indicates the page number to retrieve. Only positive number values are allowed
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;

    public ListCallMonitoringGroupMembersParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListCallMonitoringGroupMembersParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

}
