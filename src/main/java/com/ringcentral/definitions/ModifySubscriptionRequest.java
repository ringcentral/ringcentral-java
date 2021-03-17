package com.ringcentral.definitions;


public class ModifySubscriptionRequest
{
    /**
         * Collection of URIs to API resources
         * Required
         */
        public String[] eventFilters;
  public ModifySubscriptionRequest eventFilters(String[] eventFilters)
  {
    this.eventFilters = eventFilters;
    return this;
  }
  

        /**
         * Subscription lifetime in seconds. Max value is 7 days (604800 sec). For *WebHook* transport type max value might be set up to 630720000 seconds (20 years)
         */
        public Long expiresIn;
  public ModifySubscriptionRequest expiresIn(Long expiresIn)
  {
    this.expiresIn = expiresIn;
    return this;
  }
  
}
