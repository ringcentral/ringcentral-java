package com.ringcentral.definitions;


    /**
* Query parameters for operation listPermissions
*/
public class ListPermissionsParameters
{
    /**
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    public ListPermissionsParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * The number of items per page. If the provided value in the request
    * is greater than a maximum, the maximum value is applied
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 100
     * Default: 100
     */
    public Long perPage;
    public ListPermissionsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Specifies whether to return only assignable permissions
     */
    public Boolean assignable;
    public ListPermissionsParameters assignable(Boolean assignable)
    {
        this.assignable = assignable;
        return this;
    }

    /**
     * Internal identifier of a service plan
     */
    public String servicePlanId;
    public ListPermissionsParameters servicePlanId(String servicePlanId)
    {
        this.servicePlanId = servicePlanId;
        return this;
    }
}