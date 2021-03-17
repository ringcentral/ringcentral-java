package com.ringcentral.definitions;


public class CompanyAnsweringRuleCalledNumberInfo
{
    /**
         * Internal identifier of an account phone number
         */
        public String id;
  public CompanyAnsweringRuleCalledNumberInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Phone number of a callee
         */
        public String phoneNumber;
  public CompanyAnsweringRuleCalledNumberInfo phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
}
