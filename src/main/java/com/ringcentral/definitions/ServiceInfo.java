package com.ringcentral.definitions;


/**
 * Account service information, including brand, sub-brand, service plan and
 * billing plan
 */
public class ServiceInfo {
    /**
     * Canonical URI of a service info resource
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public BillingPlanInfo billingPlan;
    /**
     *
     */
    public BrandInfo brand;
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
    public CountryInfoShortModel contractedCountry;
    /**
     *
     */
    public UBrandInfo uBrand;

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

    public ServiceInfo targetServicePlan(ServicePlanInfo targetServicePlan) {
        this.targetServicePlan = targetServicePlan;
        return this;
    }

    public ServiceInfo contractedCountry(CountryInfoShortModel contractedCountry) {
        this.contractedCountry = contractedCountry;
        return this;
    }

    public ServiceInfo uBrand(UBrandInfo uBrand) {
        this.uBrand = uBrand;
        return this;
    }
}
