package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BillingPlanInfo
{
    // Internal identifier of a billing plan
    public String id;
    public BillingPlanInfo id(String id) {
        this.id = id;
        return this;
    }
    // Billing plan name
    public String name;
    public BillingPlanInfo name(String name) {
        this.name = name;
        return this;
    }
    // Duration period
    public String durationUnit;
    public BillingPlanInfo durationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
        return this;
    }
    // Number of duration units
    public String duration;
    public BillingPlanInfo duration(String duration) {
        this.duration = duration;
        return this;
    }
    // Billing plan type
    public String type;
    public BillingPlanInfo type(String type) {
        this.type = type;
        return this;
    }
}
