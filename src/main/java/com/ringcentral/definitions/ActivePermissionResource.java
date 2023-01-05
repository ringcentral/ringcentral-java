package com.ringcentral.definitions;


public class ActivePermissionResource
{
    /**
     */
    public PermissionIdResource permission;
    public ActivePermissionResource permission(PermissionIdResource permission)
    {
        this.permission = permission;
        return this;
    }

    /**
     */
    public RoleIdResource effectiveRole;
    public ActivePermissionResource effectiveRole(RoleIdResource effectiveRole)
    {
        this.effectiveRole = effectiveRole;
        return this;
    }

    /**
     * Enum: Account, AllExtensions, Federation, NonUserExtensions, RoleBased, Self, UserExtensions
     */
    public String[] scopes;
    public ActivePermissionResource scopes(String[] scopes)
    {
        this.scopes = scopes;
        return this;
    }
}