package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PermissionCategoryResource
{
    //
    public String uri;
    public PermissionCategoryResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public PermissionCategoryResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String displayName;
    public PermissionCategoryResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    //
    public String description;
    public PermissionCategoryResource description(String description) {
        this.description = description;
        return this;
    }
}
