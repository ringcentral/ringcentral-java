package com.ringcentral.definitions;


public class ForwardingRuleCreateRequest
{
    /**
     * Forwarding number (or group) ordinal. Not returned for inactive numbers
     * Format: int32
     */
    public Long index;
    public ForwardingRuleCreateRequest index(Long index)
    {
        this.index = index;
        return this;
    }

    /**
     * Number of rings for a forwarding number (or group). For inactive
    * numbers the default value (&#039;4&#039;) is returned
     * Format: int32
     */
    public Long ringCount;
    public ForwardingRuleCreateRequest ringCount(Long ringCount)
    {
        this.ringCount = ringCount;
        return this;
    }

    /**
     * Phone number status
     */
    public Boolean enabled;
    public ForwardingRuleCreateRequest enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Forwarding number (or group) data
     */
    public ForwardingNumberInfoRulesCreateRuleRequest[] forwardingNumbers;
    public ForwardingRuleCreateRequest forwardingNumbers(ForwardingNumberInfoRulesCreateRuleRequest[] forwardingNumbers)
    {
        this.forwardingNumbers = forwardingNumbers;
        return this;
    }
}