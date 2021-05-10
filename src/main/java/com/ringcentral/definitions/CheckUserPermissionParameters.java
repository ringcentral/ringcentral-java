package com.ringcentral.definitions;


// Query parameters for operation checkUserPermission
public class CheckUserPermissionParameters {
    /**
     *
     */
    public String permissionId;
    /**
     *
     */
    public String targetExtensionId;

    public CheckUserPermissionParameters permissionId(String permissionId) {
        this.permissionId = permissionId;
        return this;
    }

    public CheckUserPermissionParameters targetExtensionId(String targetExtensionId) {
        this.targetExtensionId = targetExtensionId;
        return this;
    }
}
