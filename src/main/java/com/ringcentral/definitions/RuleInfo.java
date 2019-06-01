package com.ringcentral.definitions;


public class RuleInfo {
    /**
     * Forwarding number (or group) ordinal
     */
    public Long index;
    /**
     * Number of rings for a forwarding number (or group)
     */
    public Long ringCount;
    /**
     * Forwarding number status. Returned only if `showInactiveNumbers` is set to `true`
     */
    public Boolean enabled;
    /**
     * Forwarding number (or group) data
     */
    public ForwardingNumberInfoRules[] forwardingNumbers;

    public RuleInfo index(Long index) {
        this.index = index;
        return this;
    }

    public RuleInfo ringCount(Long ringCount) {
        this.ringCount = ringCount;
        return this;
    }

    public RuleInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public RuleInfo forwardingNumbers(ForwardingNumberInfoRules[] forwardingNumbers) {
        this.forwardingNumbers = forwardingNumbers;
        return this;
    }

}
