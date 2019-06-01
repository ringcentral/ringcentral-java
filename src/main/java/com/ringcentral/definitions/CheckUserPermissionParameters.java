package com.ringcentral.definitions;


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
