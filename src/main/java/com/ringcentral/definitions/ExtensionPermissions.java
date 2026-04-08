package com.ringcentral.definitions;


    /**
* Extension permissions, corresponding to the Service Web permissions
* 'Admin' and 'InternationalCalling'
* 
*/
public class ExtensionPermissions
{
    /**
     */
    public PermissionInfoAdmin admin;
    public ExtensionPermissions admin(PermissionInfoAdmin admin)
    {
        this.admin = admin;
        return this;
    }

    /**
     */
    public PermissionInfoInt internationalCalling;
    public ExtensionPermissions internationalCalling(PermissionInfoInt internationalCalling)
    {
        this.internationalCalling = internationalCalling;
        return this;
    }
}