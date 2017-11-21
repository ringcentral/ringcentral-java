package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AssignedRoleResource
{
    //
    public String uri;
    public AssignedRoleResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public AssignedRoleResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public Boolean autoAssigned;
    public AssignedRoleResource autoAssigned(Boolean autoAssigned) {
        this.autoAssigned = autoAssigned;
        return this;
    }
    //
    public String displayName;
    public AssignedRoleResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
}
