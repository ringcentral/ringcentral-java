package com.ringcentral.definitions;


    /**
* Admin permission
*/
public class PermissionInfoAdmin
{
    /**
     * Specifies if a permission is enabled or not
     */
    public Boolean enabled;
    public PermissionInfoAdmin enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }
}