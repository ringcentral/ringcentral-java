package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


    /**
* Account service information, including brand, service plan and billing plan
* 
*/
public class AccountServiceInfo
{
    /**
     * Canonical URI of the account Service Info resource
     * Format: uri
     */
    public String uri;
    public AccountServiceInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Account Service Plan name
     */
    public String servicePlanName;
    public AccountServiceInfo servicePlanName(String servicePlanName)
    {
        this.servicePlanName = servicePlanName;
        return this;
    }

    /**
     */
    public BrandInfo brand;
    public AccountServiceInfo brand(BrandInfo brand)
    {
        this.brand = brand;
        return this;
    }

    /**
     */
    public CountryInfoShortModel contractedCountry;
    public AccountServiceInfo contractedCountry(CountryInfoShortModel contractedCountry)
    {
        this.contractedCountry = contractedCountry;
        return this;
    }

    /**
     */
    public ServicePlanInfo servicePlan;
    public AccountServiceInfo servicePlan(ServicePlanInfo servicePlan)
    {
        this.servicePlan = servicePlan;
        return this;
    }

    /**
     */
    public TargetServicePlanInfo targetServicePlan;
    public AccountServiceInfo targetServicePlan(TargetServicePlanInfo targetServicePlan)
    {
        this.targetServicePlan = targetServicePlan;
        return this;
    }

    /**
     */
    public BillingPlanInfo billingPlan;
    public AccountServiceInfo billingPlan(BillingPlanInfo billingPlan)
    {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Service features information, see Service Feature List
     */
    public ServiceFeatureInfo[] serviceFeatures;
    public AccountServiceInfo serviceFeatures(ServiceFeatureInfo[] serviceFeatures)
    {
        this.serviceFeatures = serviceFeatures;
        return this;
    }

    /**
     */
    public AccountLimits limits;
    public AccountServiceInfo limits(AccountLimits limits)
    {
        this.limits = limits;
        return this;
    }

    /**
     */
    @SerializedName("package")
    public PackageInfo _package;
    public AccountServiceInfo _package(PackageInfo _package)
    {
        this._package = _package;
        return this;
    }
}