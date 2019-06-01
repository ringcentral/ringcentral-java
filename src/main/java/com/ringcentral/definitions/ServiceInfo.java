package com.ringcentral.definitions;


public class ServiceInfo {
    /**
     * Canonical URI of a service info resource
     */
    public String uri;
    /**
     * Information on account billing plan
     */
    public BillingPlanInfo billingPlan;
    /**
     * Information on account brand
     */
    public BrandInfo brand;
    /**
     * Information on account service plan
     */
    public ServicePlanInfo servicePlan;
    /**
     * Information on account target service plan
     */
    public TargetServicePlanInfo targetServicePlan;

    public ServiceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ServiceInfo billingPlan(BillingPlanInfo billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    public ServiceInfo brand(BrandInfo brand) {
        this.brand = brand;
        return this;
    }

    public ServiceInfo servicePlan(ServicePlanInfo servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }

    public ServiceInfo targetServicePlan(TargetServicePlanInfo targetServicePlan) {
        this.targetServicePlan = targetServicePlan;
        return this;
    }

}
