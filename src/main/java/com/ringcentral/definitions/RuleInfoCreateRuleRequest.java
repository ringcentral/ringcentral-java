package com.ringcentral.definitions;


public class RuleInfoCreateRuleRequest
{
    /**
         * Forwarding number (or group) ordinal. Not returned for inactive numbers
         */
        public Long index;
  public RuleInfoCreateRuleRequest index(Long index)
  {
    this.index = index;
    return this;
  }
  

        /**
         * Number of rings for a forwarding number (or group). For inactive numbers the default value ('4') is returned
         */
        public Long ringCount;
  public RuleInfoCreateRuleRequest ringCount(Long ringCount)
  {
    this.ringCount = ringCount;
    return this;
  }
  

        /**
         * Phone number status
         */
        public Boolean enabled;
  public RuleInfoCreateRuleRequest enabled(Boolean enabled)
  {
    this.enabled = enabled;
    return this;
  }
  

        /**
         * Forwarding number (or group) data
         */
        public ForwardingNumberInfoRulesCreateRuleRequest[] forwardingNumbers;
  public RuleInfoCreateRuleRequest forwardingNumbers(ForwardingNumberInfoRulesCreateRuleRequest[] forwardingNumbers)
  {
    this.forwardingNumbers = forwardingNumbers;
    return this;
  }
  
}
