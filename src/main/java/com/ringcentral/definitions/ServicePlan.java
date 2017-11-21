package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ServicePlan
{
    //
    public String id;
    public ServicePlan id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public ServicePlan name(String name) {
        this.name = name;
        return this;
    }
    //
    public String edition;
    public ServicePlan edition(String edition) {
        this.edition = edition;
        return this;
    }
}
