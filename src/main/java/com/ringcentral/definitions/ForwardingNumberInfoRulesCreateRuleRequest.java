package com.ringcentral.definitions;


public class ForwardingNumberInfoRulesCreateRuleRequest
{
    /**
         * Internal identifier of a forwarding number
         */
        public String id;
  public ForwardingNumberInfoRulesCreateRuleRequest id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Forwarding phone number type
         * Enum: Home, Mobile, Work, PhoneLine, Outage, Other, BusinessMobilePhone, ExternalCarrier
         */
        public String type;
  public ForwardingNumberInfoRulesCreateRuleRequest type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Canonical URI of a forwarding/call flip phone number
         */
        public String uri;
  public ForwardingNumberInfoRulesCreateRuleRequest uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Forwarding/Call flip phone number
         */
        public String phoneNumber;
  public ForwardingNumberInfoRulesCreateRuleRequest phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Forwarding/Call flip number title
         */
        public String label;
  public ForwardingNumberInfoRulesCreateRuleRequest label(String label)
  {
    this.label = label;
    return this;
  }
  
}
