package com.ringcentral.definitions;


    /**
* Query parameters for operation listUserRoles
*/
public class ListUserRolesParameters
{
    /**
     * Specifies whether to return custom or predefined only roles. If not specified, all roles are returned
     */
    public Boolean custom;
    public ListUserRolesParameters custom(Boolean custom)
    {
        this.custom = custom;
        return this;
    }

    /**
     * Default: 1
     */
    public String page;
    public ListUserRolesParameters page(String page)
    {
        this.page = page;
        return this;
    }

    /**
     * Default: 100
     */
    public String perPage;
    public ListUserRolesParameters perPage(String perPage)
    {
        this.perPage = perPage;
        return this;
    }
}