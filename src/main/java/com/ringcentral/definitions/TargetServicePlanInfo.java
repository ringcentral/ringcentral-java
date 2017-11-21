package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TargetServicePlanInfo
{
    // Internal identifier of a target service plan
    public String id;
    public TargetServicePlanInfo id(String id) {
        this.id = id;
        return this;
    }
    // Name of a target service plan
    public String name;
    public TargetServicePlanInfo name(String name) {
        this.name = name;
        return this;
    }
}
