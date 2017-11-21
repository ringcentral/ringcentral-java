package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UpdateAnsweringRuleRequest
{
    // Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
    public ForwardingInfoCreateRuleRequest forwarding;
    public UpdateAnsweringRuleRequest forwarding(ForwardingInfoCreateRuleRequest forwarding) {
        this.forwarding = forwarding;
        return this;
    }
}
