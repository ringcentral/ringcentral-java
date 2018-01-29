package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CreateAnsweringRuleRequest
{
    // Specifies if the rule is active or inactive. The default value is 'True'
    public Boolean enabled;
    public CreateAnsweringRuleRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
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
    // Answering rules are applied when calling to selected number(s)
    public CalledNumberInfo[] calledNumbers;
    public CreateAnsweringRuleRequest calledNumbers(CalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }
    // Schedule when an answering rule should be applied
    public ScheduleInfo schedule;
    public CreateAnsweringRuleRequest schedule(ScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }
    // Specifies how incoming calls are forwarded
    public String callHandlingAction;
    public CreateAnsweringRuleRequest callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }
    // Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
    public ForwardingInfo forwarding;
    public CreateAnsweringRuleRequest forwarding(ForwardingInfo forwarding) {
        this.forwarding = forwarding;
        return this;
    }
    // Unconditional forwarding parameters. Returned if 'UnconditionalForwarding' is specified in 'callHandlingAction'
    public UnconditionalForwardingInfo unconditionalForwarding;
    public CreateAnsweringRuleRequest unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }
    // Queue settings applied for department (call queue) extension type, with the 'AgentQueue' value specified as a call handling action
    public QueueInfo queue;
    public CreateAnsweringRuleRequest queue(QueueInfo queue) {
        this.queue = queue;
        return this;
    }
    // Transfer settings applied for department (call queue) extension type, with 'TransferToExtension' call handling action
    public TransferredExtensionInfo transfer;
    public CreateAnsweringRuleRequest transfer(TransferredExtensionInfo transfer) {
        this.transfer = transfer;
        return this;
    }
    // Specifies whether to take a voicemail and who should do it
    public VoicemailInfo voicemail;
    public CreateAnsweringRuleRequest voicemail(VoicemailInfo voicemail) {
        this.voicemail = voicemail;
        return this;
    }
    // Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
    public GreetingInfo[] greetings;
    public CreateAnsweringRuleRequest greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }
}
