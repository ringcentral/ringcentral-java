package com.ringcentral.definitions;


public class CompanyAnsweringRuleTimeIntervalRequest
{
    /**
         * Time in format hh:mm
         */
        public String from;
  public CompanyAnsweringRuleTimeIntervalRequest from(String from)
  {
    this.from = from;
    return this;
  }
  

        /**
         * Time in format hh:mm
         */
        public String to;
  public CompanyAnsweringRuleTimeIntervalRequest to(String to)
  {
    this.to = to;
    return this;
  }
  
}
