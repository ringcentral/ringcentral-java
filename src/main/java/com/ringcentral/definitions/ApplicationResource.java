package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ApplicationResource
{
    //
    public String id;
    public ApplicationResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public ApplicationResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String description;
    public ApplicationResource description(String description) {
        this.description = description;
        return this;
    }
    //
    public OrganizationResource organization;
    public ApplicationResource organization(OrganizationResource organization) {
        this.organization = organization;
        return this;
    }
    //
    public String scope;
    public ApplicationResource scope(String scope) {
        this.scope = scope;
        return this;
    }
    //
    public String platformType;
    public ApplicationResource platformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    //
    public PermissionResource[] permissions;
    public ApplicationResource permissions(PermissionResource[] permissions) {
        this.permissions = permissions;
        return this;
    }
}
