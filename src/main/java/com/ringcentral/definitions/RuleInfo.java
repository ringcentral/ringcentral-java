package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RuleInfo
{
    // Forwarding number (or group) ordinal
    public Long index;
    public RuleInfo index(Long index) {
        this.index = index;
        return this;
    }
    // Number of rings for a forwarding number (or group)
    public Long ringCount;
    public RuleInfo ringCount(Long ringCount) {
        this.ringCount = ringCount;
        return this;
    }
    // Forwarding number (or group) data
    public ForwardingNumberInfoRules[] forwardingNumbers;
    public RuleInfo forwardingNumbers(ForwardingNumberInfoRules[] forwardingNumbers) {
        this.forwardingNumbers = forwardingNumbers;
        return this;
    }
}
