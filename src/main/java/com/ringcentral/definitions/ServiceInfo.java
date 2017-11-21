package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ServiceInfo
{
    // Canonical URI of a service info resource
    public String uri;
    public ServiceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Information on account billing plan
    public BillingPlanInfo billingPlan;
    public ServiceInfo billingPlan(BillingPlanInfo billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }
    // Information on account brand
    public BrandInfo brand;
    public ServiceInfo brand(BrandInfo brand) {
        this.brand = brand;
        return this;
    }
    // Information on account service plan
    public ServicePlanInfo servicePlan;
    public ServiceInfo servicePlan(ServicePlanInfo servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }
    // Information on account target service plan
    public TargetServicePlanInfo targetServicePlan;
    public ServiceInfo targetServicePlan(TargetServicePlanInfo targetServicePlan) {
        this.targetServicePlan = targetServicePlan;
        return this;
    }
}
