package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AnsweringRuleInfo
{
    // Canonical URI to the answering rule resource
    public String uri;
    public AnsweringRuleInfo uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Internal identifier of an answering rule
    public String id;
    public AnsweringRuleInfo id(String id) {
        this.id = id;
        return this;
    }
    // Type of an answering rule
    public String type;
    public AnsweringRuleInfo type(String type) {
        this.type = type;
        return this;
    }
    // Name of an answering rule specified by user
    public String name;
    public AnsweringRuleInfo name(String name) {
        this.name = name;
        return this;
    }
    // Specifies if an answering rule is active or inactive
    public Boolean enabled;
    public AnsweringRuleInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    // Schedule when an answering rule should be applied
    public ScheduleInfo schedule;
    public AnsweringRuleInfo schedule(ScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }
    // Answering rules are applied when calling to selected number(s)
    public CalledNumberInfo[] calledNumbers;
    public AnsweringRuleInfo calledNumbers(CalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }
    // Answering rules are applied when calls are received from specified caller(s)
    public CallersInfo[] callers;
    public AnsweringRuleInfo callers(CallersInfo[] callers) {
        this.callers = callers;
        return this;
    }
    // Specifies how incoming calls are forwarded
    public String callHandlingAction;
    public AnsweringRuleInfo callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }
    // Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
    public ForwardingInfo forwarding;
    public AnsweringRuleInfo forwarding(ForwardingInfo forwarding) {
        this.forwarding = forwarding;
        return this;
    }
    // Unconditional forwarding parameters. Returned if 'UnconditionalForwarding' is specified in 'callHandlingAction'
    public UnconditionalForwardingInfo unconditionalForwarding;
    public AnsweringRuleInfo unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }
    // Queue settings applied for department (call queue) extension type, with the 'AgentQueue' value specified as a call handling action
    public QueueInfo queue;
    public AnsweringRuleInfo queue(QueueInfo queue) {
        this.queue = queue;
        return this;
    }
    // Transfer settings applied for department (call queue) extension type, with 'TransferToExtension' call handling action
    public TransferredExtensionInfo transfer;
    public AnsweringRuleInfo transfer(TransferredExtensionInfo transfer) {
        this.transfer = transfer;
        return this;
    }
    // Specifies whether to take a voicemail and who should do it
    public VoicemailInfo voicemail;
    public AnsweringRuleInfo voicemail(VoicemailInfo voicemail) {
        this.voicemail = voicemail;
        return this;
    }
    // Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
    public GreetingInfo[] greetings;
    public AnsweringRuleInfo greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }
}
