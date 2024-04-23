package com.ringcentral.definitions;


/**
 * Query parameters for operation listStandardUserRole
 */
public class ListStandardUserRoleParameters {
    /**
     * Internal identifier of a service plan.
     */
    public String servicePlanId;
    /**
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    /**
     * The number of items per page. If provided value in the request
     * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    /**
     * Specifies whether to return advanced permissions capabilities within `permissionsCapabilities` resource.
     * The default value is false.
     */
    public Boolean advancedPermissions;

    public ListStandardUserRoleParameters servicePlanId(String servicePlanId) {
        this.servicePlanId = servicePlanId;
        return this;
    }

    public ListStandardUserRoleParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListStandardUserRoleParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListStandardUserRoleParameters advancedPermissions(Boolean advancedPermissions) {
        this.advancedPermissions = advancedPermissions;
        return this;
    }
}
