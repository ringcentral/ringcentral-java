package com.ringcentral.definitions;


/**
 * Query parameters for operation readUserRole
 */
public class ReadUserRoleParameters {
    /**
     * Specifies whether to return advanced permissions capabilities within `permissionsCapabilities` resource.
     * The default value is false
     */
    public Boolean advancedPermissions;

    public ReadUserRoleParameters advancedPermissions(Boolean advancedPermissions) {
        this.advancedPermissions = advancedPermissions;
        return this;
    }
}
