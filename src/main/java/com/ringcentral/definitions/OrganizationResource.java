package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class OrganizationResource
{
    //
    public String id;
    public OrganizationResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public OrganizationResource name(String name) {
        this.name = name;
        return this;
    }
}
