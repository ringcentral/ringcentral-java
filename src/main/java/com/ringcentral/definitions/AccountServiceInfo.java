package com.ringcentral.definitions;

public class AccountServiceInfo {
    // Canonical URI of the account Service Info resource
    public String uri;
    // Account Service Plan name
    public String servicePlanName;
    // Information on account brand
    public BrandInfo brand;
    // Information on account service plan
    public ServicePlanInfo servicePlan;
    // Information on account billing plan
    public BillingPlanInfo billingPlan;
    // Service features information, see Service Feature List
    public ServiceFeatureInfo[] serviceFeatures;
    // Limits which are effective for the account
    public AccountLimits limits;

    public AccountServiceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountServiceInfo servicePlanName(String servicePlanName) {
        this.servicePlanName = servicePlanName;
        return this;
    }

    public AccountServiceInfo brand(BrandInfo brand) {
        this.brand = brand;
        return this;
    }

    public AccountServiceInfo servicePlan(ServicePlanInfo servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }

    public AccountServiceInfo billingPlan(BillingPlanInfo billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    public AccountServiceInfo serviceFeatures(ServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    public AccountServiceInfo limits(AccountLimits limits) {
        this.limits = limits;
        return this;
    }
}
