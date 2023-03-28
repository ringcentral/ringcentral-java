package com.ringcentral.definitions;


public class ForwardingRuleInfo {
    /**
     * Forwarding number (or group) ordinal
     * Format: int32
     */
    public Long index;
    /**
     * Number of rings for a forwarding number (or group)
     * Format: int32
     */
    public Long ringCount;
    /**
     * Forwarding number status. Returned only if `showInactiveNumbers` is set to `true`
     */
    public Boolean enabled;
    /**
     * Forwarding number (or group) data
     */
    public CreateAnsweringRuleForwardingNumberInfo[] forwardingNumbers;

    public ForwardingRuleInfo index(Long index) {
        this.index = index;
        return this;
    }

    public ForwardingRuleInfo ringCount(Long ringCount) {
        this.ringCount = ringCount;
        return this;
    }

    public ForwardingRuleInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ForwardingRuleInfo forwardingNumbers(CreateAnsweringRuleForwardingNumberInfo[] forwardingNumbers) {
        this.forwardingNumbers = forwardingNumbers;
        return this;
    }
}
