package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AssignedRolesResource
{
    //
    public String uri;
    public AssignedRolesResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public AssignedRoleResource[] records;
    public AssignedRolesResource records(AssignedRoleResource[] records) {
        this.records = records;
        return this;
    }
}
