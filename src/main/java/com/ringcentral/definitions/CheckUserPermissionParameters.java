package com.ringcentral.definitions;


/**
 * Query parameters for operation checkUserPermission
 */
public class CheckUserPermissionParameters {
    /**
     * The ID of the permission to be checked
     */
    public String permissionId;
    /**
     * The target extension ID (that can be an &quot;object&quot; of certain permissions)
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
