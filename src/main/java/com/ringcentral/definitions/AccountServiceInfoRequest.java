package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


/**
 * Account service information, including brand, service plan and billing plan
 */
public class AccountServiceInfoRequest {
    /**
     * Canonical URI of the account Service Info resource
     * Format: uri
     */
    public String uri;
    /**
     * Account Service Plan name
     */
    public String servicePlanName;
    /**
     *
     */
    public BrandInfo brand;
    /**
     *
     */
    public CountryInfoShortModel contractedCountry;
    /**
     *
     */
    public ServicePlanInfo servicePlan;
    /**
     *
     */
    public ServicePlanInfo targetServicePlan;
    /**
     *
     */
    public BillingPlanInfo billingPlan;
    /**
     * Service features information, see Service Feature List
     */
    public ServiceFeatureInfo[] serviceFeatures;
    /**
     *
     */
    public AccountLimitsInfo limits;
    /**
     *
     */
    @SerializedName("package")
    public BillingPackageInfo _package;

    public AccountServiceInfoRequest uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountServiceInfoRequest servicePlanName(String servicePlanName) {
        this.servicePlanName = servicePlanName;
        return this;
    }

    public AccountServiceInfoRequest brand(BrandInfo brand) {
        this.brand = brand;
        return this;
    }

    public AccountServiceInfoRequest contractedCountry(CountryInfoShortModel contractedCountry) {
        this.contractedCountry = contractedCountry;
        return this;
    }

    public AccountServiceInfoRequest servicePlan(ServicePlanInfo servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }

    public AccountServiceInfoRequest targetServicePlan(ServicePlanInfo targetServicePlan) {
        this.targetServicePlan = targetServicePlan;
        return this;
    }

    public AccountServiceInfoRequest billingPlan(BillingPlanInfo billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    public AccountServiceInfoRequest serviceFeatures(ServiceFeatureInfo[] serviceFeatures) {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    public AccountServiceInfoRequest limits(AccountLimitsInfo limits) {
        this.limits = limits;
        return this;
    }

    public AccountServiceInfoRequest _package(BillingPackageInfo _package) {
        this._package = _package;
        return this;
    }
}
