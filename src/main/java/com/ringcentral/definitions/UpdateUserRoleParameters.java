package com.ringcentral.definitions;


/**
 * Query parameters for operation updateUserRole
 */
public class UpdateUserRoleParameters {
    /**
     * Specifies whether to return advanced permissions capabilities within `permissionsCapabilities` resource.
     * The default value is false
     */
    public Boolean advancedPermissions;

    public UpdateUserRoleParameters advancedPermissions(Boolean advancedPermissions) {
        this.advancedPermissions = advancedPermissions;
        return this;
    }
}
