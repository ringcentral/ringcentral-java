package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DefaultUserRoleRequest
{
    // Internal identifier of a user role to be set as default, see User Role List
    public String id;
    public DefaultUserRoleRequest id(String id) {
        this.id = id;
        return this;
    }
}
