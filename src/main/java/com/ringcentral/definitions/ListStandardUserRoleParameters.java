package com.ringcentral.definitions;


// Query parameters for operation listStandardUserRole
public class ListStandardUserRoleParameters {
    /**
     * Default: 1
     */
    public String page;
    /**
     * Default: 100
     */
    public String perPage;
    /**
     *
     */
    public String servicePlanId;

    public ListStandardUserRoleParameters page(String page) {
        this.page = page;
        return this;
    }

    public ListStandardUserRoleParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListStandardUserRoleParameters servicePlanId(String servicePlanId) {
        this.servicePlanId = servicePlanId;
        return this;
    }
}
