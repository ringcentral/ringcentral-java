package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ForwardingInfoCreateRuleRequest
{
    // Information on a call forwarding rule
    public RuleInfoCreateRuleRequest[] rules;
    public ForwardingInfoCreateRuleRequest rules(RuleInfoCreateRuleRequest[] rules) {
        this.rules = rules;
        return this;
    }
}
