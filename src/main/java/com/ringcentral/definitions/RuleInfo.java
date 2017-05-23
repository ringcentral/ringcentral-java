package com.ringcentral.definitions;

public class RuleInfo {
    // Forwarding number (or group) ordinal
    public Long index;
    // Number of rings for a forwarding number (or group)
    public Long ringCount;
    // Forwarding number (or group) data
    public RuleInfo_ForwardingNumberInfo[] forwardingNumbers;

    public RuleInfo index(Long index) {
        this.index = index;
        return this;
    }

    public RuleInfo ringCount(Long ringCount) {
        this.ringCount = ringCount;
        return this;
    }

    public RuleInfo forwardingNumbers(RuleInfo_ForwardingNumberInfo[] forwardingNumbers) {
        this.forwardingNumbers = forwardingNumbers;
        return this;
    }
}
