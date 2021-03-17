package com.ringcentral.definitions;


public class CreateAnsweringRuleForwardingNumberInfo
{
    /**
         * Internal identifier of a forwarding number
         */
        public String id;
  public CreateAnsweringRuleForwardingNumberInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Canonical URI of a forwarding/call flip phone number
         */
        public String uri;
  public CreateAnsweringRuleForwardingNumberInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Forwarding/Call flip phone number
         */
        public String phoneNumber;
  public CreateAnsweringRuleForwardingNumberInfo phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Forwarding/Call flip number title
         */
        public String label;
  public CreateAnsweringRuleForwardingNumberInfo label(String label)
  {
    this.label = label;
    return this;
  }
  

        /**
         * Type of a forwarding number
         * Enum: Home, Mobile, Work, PhoneLine, Outage, Other, BusinessMobilePhone, ExternalCarrier
         */
        public String type;
  public CreateAnsweringRuleForwardingNumberInfo type(String type)
  {
    this.type = type;
    return this;
  }
  
}
