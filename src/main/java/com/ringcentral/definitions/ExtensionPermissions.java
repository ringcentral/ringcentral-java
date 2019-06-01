package com.ringcentral.definitions;


// Extension permissions, corresponding to the Service Web permissions 'Admin' and 'InternationalCalling'
public class ExtensionPermissions {
    /**
     * Admin permission
     */
    public PermissionInfo admin;
    /**
     * International Calling permission
     */
    public PermissionInfo internationalCalling;

    public ExtensionPermissions admin(PermissionInfo admin) {
        this.admin = admin;
        return this;
    }

    public ExtensionPermissions internationalCalling(PermissionInfo internationalCalling) {
        this.internationalCalling = internationalCalling;
        return this;
    }

}
