package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class GetServiceInfoResponse
{
    /**
         * Canonical URI of the account Service Info resource
         */
        public String uri;
  public GetServiceInfoResponse uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Account Service Plan name
         */
        public String servicePlanName;
  public GetServiceInfoResponse servicePlanName(String servicePlanName)
  {
    this.servicePlanName = servicePlanName;
    return this;
  }
  

        /**
         */
        public BrandInfo brand;
  public GetServiceInfoResponse brand(BrandInfo brand)
  {
    this.brand = brand;
    return this;
  }
  

        /**
         */
        public ContractedCountryInfo contractedCountry;
  public GetServiceInfoResponse contractedCountry(ContractedCountryInfo contractedCountry)
  {
    this.contractedCountry = contractedCountry;
    return this;
  }
  

        /**
         */
        public ServicePlanInfo servicePlan;
  public GetServiceInfoResponse servicePlan(ServicePlanInfo servicePlan)
  {
    this.servicePlan = servicePlan;
    return this;
  }
  

        /**
         */
        public TargetServicePlanInfo targetServicePlan;
  public GetServiceInfoResponse targetServicePlan(TargetServicePlanInfo targetServicePlan)
  {
    this.targetServicePlan = targetServicePlan;
    return this;
  }
  

        /**
         */
        public BillingPlanInfo billingPlan;
  public GetServiceInfoResponse billingPlan(BillingPlanInfo billingPlan)
  {
    this.billingPlan = billingPlan;
    return this;
  }
  

        /**
         * Service features information, see Service Feature List
         */
        public ServiceFeatureInfo[] serviceFeatures;
  public GetServiceInfoResponse serviceFeatures(ServiceFeatureInfo[] serviceFeatures)
  {
    this.serviceFeatures = serviceFeatures;
    return this;
  }
  

        /**
         */
        public AccountLimits limits;
  public GetServiceInfoResponse limits(AccountLimits limits)
  {
    this.limits = limits;
    return this;
  }
  

        /**
         */
        @SerializedName("package")
        public PackageInfo _package;
  public GetServiceInfoResponse _package(PackageInfo _package)
  {
    this._package = _package;
    return this;
  }
  
}
