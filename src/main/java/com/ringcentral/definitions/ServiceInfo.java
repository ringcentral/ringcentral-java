package com.ringcentral.definitions;


    // Account service information, including brand, service plan and billing plan
public class ServiceInfo
{
    /**
         * Canonical URI of a service info resource
         */
        public String uri;
  public ServiceInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public BillingPlanInfo billingPlan;
  public ServiceInfo billingPlan(BillingPlanInfo billingPlan)
  {
    this.billingPlan = billingPlan;
    return this;
  }
  

        /**
         */
        public BrandInfo brand;
  public ServiceInfo brand(BrandInfo brand)
  {
    this.brand = brand;
    return this;
  }
  

        /**
         */
        public ServicePlanInfo servicePlan;
  public ServiceInfo servicePlan(ServicePlanInfo servicePlan)
  {
    this.servicePlan = servicePlan;
    return this;
  }
  

        /**
         */
        public TargetServicePlanInfo targetServicePlan;
  public ServiceInfo targetServicePlan(TargetServicePlanInfo targetServicePlan)
  {
    this.targetServicePlan = targetServicePlan;
    return this;
  }
  

        /**
         */
        public ContractedCountryInfo contractedCountry;
  public ServiceInfo contractedCountry(ContractedCountryInfo contractedCountry)
  {
    this.contractedCountry = contractedCountry;
    return this;
  }
  
}
