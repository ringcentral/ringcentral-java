package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class GetServiceInfoResponse {
    /**
     * Canonical URI of the account Service Info resource
     */
    public String uri;
    /**
     * Account Service Plan name
     */
    public String servicePlanName;
    /**
     * Information on account brand
     */
    public BrandInfo brand;
    /**
     * Information on account service plan
     */
    public ServicePlanInfo servicePlan;
    /**
     *
     */
    public ServicePlanInfo targetServicePlan;
    /**
     * Information on account billing plan
     */
    public BillingPlanInfo billingPlan;
    /**
     * Service features information, see Service Feature List
     */
    public ServiceFeatureInfo[] serviceFeatures;
    /**
     * Limits which are effective for the account
     */
    public AccountLimits limits;
    /**
     *
     */
    @SerializedName("package")
    public PackageInfo _package;

    public GetServiceInfoResponse uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GetServiceInfoResponse servicePlanName(String servicePlanName) {
        this.servicePlanName = servicePlanName;
        return this;
    }

    public GetServiceInfoResponse brand(BrandInfo brand) {
        this.brand = brand;
        return this;
    }

    public GetServiceInfoResponse servicePlan(ServicePlanInfo servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }

    public GetServiceInfoResponse targetServicePlan(ServicePlanInfo targetServicePlan) {
        this.targetServicePlan = targetServicePlan;
        return this;
    }

    public GetServiceInfoResponse billingPlan(BillingPlanInfo billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    public GetServiceInfoResponse serviceFeatures(ServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    public GetServiceInfoResponse limits(AccountLimits limits) {
        this.limits = limits;
        return this;
    }

    public GetServiceInfoResponse _package(PackageInfo _package) {
        this._package = _package;
        return this;
    }

}
