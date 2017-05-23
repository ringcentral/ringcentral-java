package com.ringcentral.definitions;

public class PermissionDetailsInfo {
    // Information on a permission checked
    public UserPermissionInfo permission;

    public PermissionDetailsInfo permission(UserPermissionInfo permission) {
        this.permission = permission;
        return this;
    }
}
