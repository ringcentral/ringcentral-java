package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


    /**
* Account service information, including brand, service plan and billing plan
* 
*/
public class AccountServiceInfoRequest
{
    /**
     * Canonical URI of the account Service Info resource
     * Format: uri
     */
    public String uri;
    public AccountServiceInfoRequest uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Account Service Plan name
     */
    public String servicePlanName;
    public AccountServiceInfoRequest servicePlanName(String servicePlanName)
    {
        this.servicePlanName = servicePlanName;
        return this;
    }

    /**
     */
    public BrandInfo brand;
    public AccountServiceInfoRequest brand(BrandInfo brand)
    {
        this.brand = brand;
        return this;
    }

    /**
     */
    public CountryInfoShortModel contractedCountry;
    public AccountServiceInfoRequest contractedCountry(CountryInfoShortModel contractedCountry)
    {
        this.contractedCountry = contractedCountry;
        return this;
    }

    /**
     */
    public ServicePlanInfo servicePlan;
    public AccountServiceInfoRequest servicePlan(ServicePlanInfo servicePlan)
    {
        this.servicePlan = servicePlan;
        return this;
    }

    /**
     */
    public ServicePlanInfo targetServicePlan;
    public AccountServiceInfoRequest targetServicePlan(ServicePlanInfo targetServicePlan)
    {
        this.targetServicePlan = targetServicePlan;
        return this;
    }

    /**
     */
    public BillingPlanInfo billingPlan;
    public AccountServiceInfoRequest billingPlan(BillingPlanInfo billingPlan)
    {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Service features information, see Service Feature List
     */
    public ServiceFeatureInfo[] serviceFeatures;
    public AccountServiceInfoRequest serviceFeatures(ServiceFeatureInfo[] serviceFeatures)
    {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    /**
     */
    public AccountLimitsInfo limits;
    public AccountServiceInfoRequest limits(AccountLimitsInfo limits)
    {
        this.limits = limits;
        return this;
    }

    /**
     */
    @SerializedName("package")
    public BillingPackageInfo _package;
    public AccountServiceInfoRequest _package(BillingPackageInfo _package)
    {
        this._package = _package;
        return this;
    }
}