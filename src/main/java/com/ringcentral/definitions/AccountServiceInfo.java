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
}
