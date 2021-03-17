package com.ringcentral.definitions;


public class CompanyAnsweringRuleCalledNumberInfoRequest
{
    /**
         * Internal identifier of an account phone number
         */
        public String id;
  public CompanyAnsweringRuleCalledNumberInfoRequest id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Phone number of a callee
         */
        public String phoneNumber;
  public CompanyAnsweringRuleCalledNumberInfoRequest phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
}
