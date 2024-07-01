package com.ringcentral.definitions;


public class ActivePermissionResource {
    /**
     *
     */
    public PermissionIdResource permission;
    /**
     *
     */
    public RoleIdResource effectiveRole;
    /**
     * Enum: Account, AllExtensions, Federation, NonUserExtensions, RoleBased, Self, UserExtensions
     */
    public String[] scopes;

    public ActivePermissionResource permission(PermissionIdResource permission) {
        this.permission = permission;
        return this;
    }

    public ActivePermissionResource effectiveRole(RoleIdResource effectiveRole) {
        this.effectiveRole = effectiveRole;
        return this;
    }

    public ActivePermissionResource scopes(String[] scopes) {
        this.scopes = scopes;
        return this;
    }
}
