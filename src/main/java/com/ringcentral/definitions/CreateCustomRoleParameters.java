package com.ringcentral.definitions;


/**
 * Query parameters for operation createCustomRole
 */
public class CreateCustomRoleParameters {
    /**
     * Specifies whether to return advanced permissions capabilities within `permissionsCapabilities` resource.
     * The default value is false
     */
    public Boolean advancedPermissions;

    public CreateCustomRoleParameters advancedPermissions(Boolean advancedPermissions) {
        this.advancedPermissions = advancedPermissions;
        return this;
    }
}
