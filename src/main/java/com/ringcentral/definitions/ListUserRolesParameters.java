package com.ringcentral.definitions;


    /**
* Query parameters for operation listUserRoles
*/
public class ListUserRolesParameters
{
    /**
     * Specifies whether to return custom roles or predefined roles only.
    * If not specified, all roles are returned
     */
    public Boolean custom;
    public ListUserRolesParameters custom(Boolean custom)
    {
        this.custom = custom;
        return this;
    }

    /**
     * The result set page number (1-indexed) to return
     * Maximum: 1000
     * Minimum: 1
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long page;
    public ListUserRolesParameters page(Long page)
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
    public ListUserRolesParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}