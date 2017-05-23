package com.ringcentral.definitions;

public class AnsweringRuleInfo {
    // Canonical URI to the answering rule resource
    public String uri;
    // Internal identifier of an asnwering rule
    public String id;
    // Type of an answering rule
    public String type;
    // Name of an answering rule specified by user
    public String name;
    // Specifies if an answering rule is active or inactive
    public Boolean enabled;
    // Schedule when an answering rule should be applied
    public ScheduleInfo schedule;
    // Answering rules are applied when calling to selected number(s)
    public AnsweringRuleInfo_CalleeInfo[] calledNumbers;
    // Answering rules are applied when calls are received from specified caller(s)
    public AnsweringRuleInfo_CallerInfo[] callers;
    // Specifies how incoming calls are forwarded
    public String callHandlingAction;
    // Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
    public ForwardingInfo forwarding;
    // Unconditional forwarding parameters. Returned if 'UnconditionalForwarding' is specified in 'callHandlingAction'
    public UnconditionalForwardingInfo unconditionalForwarding;
    // Specifies whether to take a voicemail and who should do it
    public VoicemailInfo voicemail;
    // Predefined greetings applied for an answering rule
    public GreetingInfo[] greetings;

    public AnsweringRuleInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AnsweringRuleInfo id(String id) {
        this.id = id;
        return this;
    }

    public AnsweringRuleInfo type(String type) {
        this.type = type;
        return this;
    }

    public AnsweringRuleInfo name(String name) {
        this.name = name;
        return this;
    }

    public AnsweringRuleInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public AnsweringRuleInfo schedule(ScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

    public AnsweringRuleInfo calledNumbers(AnsweringRuleInfo_CalleeInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public AnsweringRuleInfo callers(AnsweringRuleInfo_CallerInfo[] callers) {
        this.callers = callers;
        return this;
    }

    public AnsweringRuleInfo callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    public AnsweringRuleInfo forwarding(ForwardingInfo forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    public AnsweringRuleInfo unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }

    public AnsweringRuleInfo voicemail(VoicemailInfo voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public AnsweringRuleInfo greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }
}
