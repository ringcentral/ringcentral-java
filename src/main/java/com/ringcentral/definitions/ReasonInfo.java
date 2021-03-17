package com.ringcentral.definitions;


    // Reason for the feature unavailability. Returned only if `available` is set to 'false'
public class ReasonInfo
{
    /**
         * Reason code
         * Enum: ServicePlanLimitation, AccountLimitation, ExtensionTypeLimitation, ExtensionLimitation, InsufficientPermissions, ConfigurationLimitation
         */
        public String code;
  public ReasonInfo code(String code)
  {
    this.code = code;
    return this;
  }
  

        /**
         * Reason description
         */
        public String message;
  public ReasonInfo message(String message)
  {
    this.message = message;
    return this;
  }
  

        /**
         */
        public String permission;
  public ReasonInfo permission(String permission)
  {
    this.permission = permission;
    return this;
  }
  
}
