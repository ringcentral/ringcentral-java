package com.ringcentral.definitions;


    /**
* Query parameters for operation listPermissions
*/
public class ListPermissionsParameters
{
    /**
     * Default: 1
     */
    public String page;
    public ListPermissionsParameters page(String page)
    {
        this.page = page;
        return this;
    }

    /**
     * Default: 100
     */
    public String perPage;
    public ListPermissionsParameters perPage(String perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     */
    public Boolean assignable;
    public ListPermissionsParameters assignable(Boolean assignable)
    {
        this.assignable = assignable;
        return this;
    }

    /**
     */
    public String servicePlanId;
    public ListPermissionsParameters servicePlanId(String servicePlanId)
    {
        this.servicePlanId = servicePlanId;
        return this;
    }
}