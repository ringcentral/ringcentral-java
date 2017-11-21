package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BillingPlanResource
{
    //
    public String uri;
    public BillingPlanResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public BillingPlanResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public BillingPlanResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String durationUnit;
    public BillingPlanResource durationUnit(String durationUnit) {
        this.durationUnit = durationUnit;
        return this;
    }
    //
    public Long duration;
    public BillingPlanResource duration(Long duration) {
        this.duration = duration;
        return this;
    }
    //
    public String type;
    public BillingPlanResource type(String type) {
        this.type = type;
        return this;
    }
}
