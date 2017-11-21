package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ActivePermissionResource
{
    //
    public PermissionIdResource permission;
    public ActivePermissionResource permission(PermissionIdResource permission) {
        this.permission = permission;
        return this;
    }
    //
    public RoleIdResource effectiveRole;
    public ActivePermissionResource effectiveRole(RoleIdResource effectiveRole) {
        this.effectiveRole = effectiveRole;
        return this;
    }
    //
    public String[] scopes;
    public ActivePermissionResource scopes(String[] scopes) {
        this.scopes = scopes;
        return this;
    }
}
