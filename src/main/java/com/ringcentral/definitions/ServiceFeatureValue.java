package com.ringcentral.definitions;


public class ServiceFeatureValue
{
    /**
         */
        public String featureName;
  public ServiceFeatureValue featureName(String featureName)
  {
    this.featureName = featureName;
    return this;
  }
  

        /**
         */
        public Boolean enabled;
  public ServiceFeatureValue enabled(Boolean enabled)
  {
    this.enabled = enabled;
    return this;
  }
  

        /**
         * Enum: Available, AccountTypeLimitation, ExtensionTypeLimitation, AccountLimitation, ExtensionLimitation, InsufficientPermissions, ApplicationLimitation
         */
        public String reason;
  public ServiceFeatureValue reason(String reason)
  {
    this.reason = reason;
    return this;
  }
  
}
