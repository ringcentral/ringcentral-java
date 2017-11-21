package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionWithRolesResource
{
    //
    public String uri;
    public ExtensionWithRolesResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String extensionId;
    public ExtensionWithRolesResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    //
    public AssignedRoleResource[] roles;
    public ExtensionWithRolesResource roles(AssignedRoleResource[] roles) {
        this.roles = roles;
        return this;
    }
}
