package com.ringcentral.definitions;


public class ListDepartmentMembersParameters {
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;

    public ListDepartmentMembersParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListDepartmentMembersParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

}
