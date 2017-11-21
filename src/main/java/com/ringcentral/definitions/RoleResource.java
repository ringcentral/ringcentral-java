package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RoleResource
{
    //
    public String uri;
    public RoleResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public RoleResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String displayName;
    public RoleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    //
    public String description;
    public RoleResource description(String description) {
        this.description = description;
        return this;
    }
    //
    public Boolean custom;
    public RoleResource custom(Boolean custom) {
        this.custom = custom;
        return this;
    }
    //
    public String scope;
    public RoleResource scope(String scope) {
        this.scope = scope;
        return this;
    }
    //
    public Boolean hidden;
    public RoleResource hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }
    //
    public String lastUpdated;
    public RoleResource lastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
        return this;
    }
    //
    public PermissionIdResource[] permissions;
    public RoleResource permissions(PermissionIdResource[] permissions) {
        this.permissions = permissions;
        return this;
    }
}
