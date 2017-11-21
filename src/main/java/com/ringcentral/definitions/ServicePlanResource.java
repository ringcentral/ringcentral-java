package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ServicePlanResource
{
    //
    public String uri;
    public ServicePlanResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public ServicePlanResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String name;
    public ServicePlanResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public String edition;
    public ServicePlanResource edition(String edition) {
        this.edition = edition;
        return this;
    }
    //
    public BrandResource brand;
    public ServicePlanResource brand(BrandResource brand) {
        this.brand = brand;
        return this;
    }
    //
    public String type;
    public ServicePlanResource type(String type) {
        this.type = type;
        return this;
    }
    //
    public ServiceFeatureValue[] serviceFeatures;
    public ServicePlanResource serviceFeatures(ServiceFeatureValue[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }
    //
    public AccountLimitsResource limits;
    public ServicePlanResource limits(AccountLimitsResource limits) {
        this.limits = limits;
        return this;
    }
}
