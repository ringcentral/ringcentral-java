package com.ringcentral.definitions;

public class UserPermission {
    // Information on a permission granted
    public UserPermissionInfo permission;
    // List of active scopes for permission
    public String[] scopes;

    public UserPermission permission(UserPermissionInfo permission) {
        this.permission = permission;
        return this;
    }

    public UserPermission scopes(String[] scopes) {
        this.scopes = scopes;
        return this;
    }
}
