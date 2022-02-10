package com.ringcentral.definitions;


/**
 * Query parameters for operation listPermissions
 */
public class ListPermissionsParameters {
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
    public Boolean assignable;
    /**
     *
     */
    public String servicePlanId;

    public ListPermissionsParameters page(String page) {
        this.page = page;
        return this;
    }

    public ListPermissionsParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListPermissionsParameters assignable(Boolean assignable) {
        this.assignable = assignable;
        return this;
    }

    public ListPermissionsParameters servicePlanId(String servicePlanId) {
        this.servicePlanId = servicePlanId;
        return this;
    }
}
