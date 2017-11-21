package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UserGroupResource
{
    //
    public String uri;
    public UserGroupResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public UserGroupResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String displayName;
    public UserGroupResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    //
    public String description;
    public UserGroupResource description(String description) {
        this.description = description;
        return this;
    }
    //
    public UserGroupManagerResource[] managers;
    public UserGroupResource managers(UserGroupManagerResource[] managers) {
        this.managers = managers;
        return this;
    }
    //
    public ExtensionIdResource[] members;
    public UserGroupResource members(ExtensionIdResource[] members) {
        this.members = members;
        return this;
    }
}
