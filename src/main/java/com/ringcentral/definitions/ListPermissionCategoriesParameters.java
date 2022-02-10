package com.ringcentral.definitions;


/**
 * Query parameters for operation listPermissionCategories
 */
public class ListPermissionCategoriesParameters {
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

    public ListPermissionCategoriesParameters page(String page) {
        this.page = page;
        return this;
    }

    public ListPermissionCategoriesParameters perPage(String perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListPermissionCategoriesParameters servicePlanId(String servicePlanId) {
        this.servicePlanId = servicePlanId;
        return this;
    }
}
