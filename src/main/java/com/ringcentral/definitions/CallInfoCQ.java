package com.ringcentral.definitions;


    // Primary/additional CQ information
public class CallInfoCQ
{
    /**
         */
        public PrimaryCQInfo primary;
  public CallInfoCQ primary(PrimaryCQInfo primary)
  {
    this.primary = primary;
    return this;
  }
  

        /**
         */
        public AdditionalCQInfo additional;
  public CallInfoCQ additional(AdditionalCQInfo additional)
  {
    this.additional = additional;
    return this;
  }
  
}
