package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ForwardingNumberInfoRulesCreateRuleRequest
{
    // Internal identifier of a forwarding number
    public String id;
    public ForwardingNumberInfoRulesCreateRuleRequest id(String id) {
        this.id = id;
        return this;
    }
}
