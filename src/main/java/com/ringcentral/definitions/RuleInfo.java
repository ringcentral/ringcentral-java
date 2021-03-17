package com.ringcentral.definitions;


public class RuleInfo
{
    /**
         * Forwarding number (or group) ordinal
         */
        public Long index;
  public RuleInfo index(Long index)
  {
    this.index = index;
    return this;
  }
  

        /**
         * Number of rings for a forwarding number (or group)
         */
        public Long ringCount;
  public RuleInfo ringCount(Long ringCount)
  {
    this.ringCount = ringCount;
    return this;
  }
  

        /**
         * Forwarding number status. Returned only if `showInactiveNumbers` is set to `true`
         */
        public Boolean enabled;
  public RuleInfo enabled(Boolean enabled)
  {
    this.enabled = enabled;
    return this;
  }
  

        /**
         * Forwarding number (or group) data
         */
        public CreateAnsweringRuleForwardingNumberInfo[] forwardingNumbers;
  public RuleInfo forwardingNumbers(CreateAnsweringRuleForwardingNumberInfo[] forwardingNumbers)
  {
    this.forwardingNumbers = forwardingNumbers;
    return this;
  }
  
}
