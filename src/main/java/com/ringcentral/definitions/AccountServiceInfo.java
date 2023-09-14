package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


/**
 * Account service information, including brand, service plan and billing plan
 */
public class AccountServiceInfo {
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
    public TargetServicePlanInfo targetServicePlan;
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
    public AccountLimits limits;
    /**
     *
     */
    @SerializedName("package")
    public PackageInfo _package;
    /**
     *
     */
    public UBrandInfo uBrand;

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

    public AccountServiceInfo contractedCountry(CountryInfoShortModel contractedCountry) {
        this.contractedCountry = contractedCountry;
        return this;
    }

    public AccountServiceInfo servicePlan(ServicePlanInfo servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }

    public AccountServiceInfo targetServicePlan(TargetServicePlanInfo targetServicePlan) {
        this.targetServicePlan = targetServicePlan;
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

    public AccountServiceInfo _package(PackageInfo _package) {
        this._package = _package;
        return this;
    }

    public AccountServiceInfo uBrand(UBrandInfo uBrand) {
        this.uBrand = uBrand;
        return this;
    }
}
