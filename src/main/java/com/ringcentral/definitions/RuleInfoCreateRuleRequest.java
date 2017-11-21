package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class RuleInfoCreateRuleRequest
{
    // Forwarding number (or group) ordinal
    public Long index;
    public RuleInfoCreateRuleRequest index(Long index) {
        this.index = index;
        return this;
    }
    // Number of rings for a forwarding number (or group)
    public Long ringCount;
    public RuleInfoCreateRuleRequest ringCount(Long ringCount) {
        this.ringCount = ringCount;
        return this;
    }
    // Forwarding number (or group) data
    public ForwardingNumberInfoRulesCreateRuleRequest[] forwardingNumbers;
    public RuleInfoCreateRuleRequest forwardingNumbers(ForwardingNumberInfoRulesCreateRuleRequest[] forwardingNumbers) {
        this.forwardingNumbers = forwardingNumbers;
        return this;
    }
}
