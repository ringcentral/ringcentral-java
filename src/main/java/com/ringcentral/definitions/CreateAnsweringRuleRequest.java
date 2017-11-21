package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CreateAnsweringRuleRequest
{
    // Type of an answering rule. The 'Custom' value should be specified
    public String type;
    public CreateAnsweringRuleRequest type(String type) {
        this.type = type;
        return this;
    }
    // Name of an answering rule specified by user
    public String name;
    public CreateAnsweringRuleRequest name(String name) {
        this.name = name;
        return this;
    }
    // Answering rule will be applied when calls are received from the specified caller(s)
    public CallersInfoRequest[] callers;
    public CreateAnsweringRuleRequest callers(CallersInfoRequest[] callers) {
        this.callers = callers;
        return this;
    }
    // Forwarding parameters. Should be specified if the 'callHandlingAction' parameter value is set to 'ForwardCalls'. These settings determine the forwarding numbers to which the call should be forwarded
    public ForwardingInfoCreateRuleRequest forwarding;
    public CreateAnsweringRuleRequest forwarding(ForwardingInfoCreateRuleRequest forwarding) {
        this.forwarding = forwarding;
        return this;
    }
}
