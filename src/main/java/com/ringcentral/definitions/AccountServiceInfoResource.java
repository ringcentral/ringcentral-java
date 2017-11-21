package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountServiceInfoResource
{
    //
    public String uri;
    public AccountServiceInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String servicePlanName;
    public AccountServiceInfoResource servicePlanName(String servicePlanName) {
        this.servicePlanName = servicePlanName;
        return this;
    }
    //
    public Brand brand;
    public AccountServiceInfoResource brand(Brand brand) {
        this.brand = brand;
        return this;
    }
    //
    public ServicePlan servicePlan;
    public AccountServiceInfoResource servicePlan(ServicePlan servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }
    //
    public ServicePlan targetServicePlan;
    public AccountServiceInfoResource targetServicePlan(ServicePlan targetServicePlan) {
        this.targetServicePlan = targetServicePlan;
        return this;
    }
    //
    public BillingPlanResource billingPlan;
    public AccountServiceInfoResource billingPlan(BillingPlanResource billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }
    //
    public ServiceFeatureValue[] serviceFeatures;
    public AccountServiceInfoResource serviceFeatures(ServiceFeatureValue[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }
    //
    public AccountLimitsResource limits;
    public AccountServiceInfoResource limits(AccountLimitsResource limits) {
        this.limits = limits;
        return this;
    }
}
