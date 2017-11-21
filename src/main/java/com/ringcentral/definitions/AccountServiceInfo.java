package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountServiceInfo
{
    // Canonical URI of the account Service Info resource
    public String uri;
    public AccountServiceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Account Service Plan name
    public String servicePlanName;
    public AccountServiceInfo servicePlanName(String servicePlanName) {
        this.servicePlanName = servicePlanName;
        return this;
    }
    // Information on account brand
    public BrandInfo brand;
    public AccountServiceInfo brand(BrandInfo brand) {
        this.brand = brand;
        return this;
    }
    // Information on account service plan
    public ServicePlanInfo servicePlan;
    public AccountServiceInfo servicePlan(ServicePlanInfo servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }
    // Information on account billing plan
    public BillingPlanInfo billingPlan;
    public AccountServiceInfo billingPlan(BillingPlanInfo billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }
    // Service features information, see Service Feature List
    public ServiceFeatureInfo[] serviceFeatures;
    public AccountServiceInfo serviceFeatures(ServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }
    // Limits which are effective for an account
    public AccountLimits limits;
    public AccountServiceInfo limits(AccountLimits limits) {
        this.limits = limits;
        return this;
    }
}
