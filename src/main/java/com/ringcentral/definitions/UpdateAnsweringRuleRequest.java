package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UpdateAnsweringRuleRequest
{
    // Name of an answering rule specified by user
    public String name;
    public UpdateAnsweringRuleRequest name(String name) {
        this.name = name;
        return this;
    }
    // Specifies if an answering rule is active or inactive
    public Boolean enabled;
    public UpdateAnsweringRuleRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    // Answering rules are applied when calls are received from specified caller(s)
    public CallersInfo[] callers;
    public UpdateAnsweringRuleRequest callers(CallersInfo[] callers) {
        this.callers = callers;
        return this;
    }
    // Answering rules are applied when calling to selected number(s)
    public CalledNumberInfo[] calledNumbers;
    public UpdateAnsweringRuleRequest calledNumbers(CalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }
    // Schedule when an answering rule should be applied
    public ScheduleInfo schedule;
    public UpdateAnsweringRuleRequest schedule(ScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }
    // Specifies how incoming calls are forwarded
    public String callHandlingAction;
    public UpdateAnsweringRuleRequest callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }
    // Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
    public ForwardingInfo forwarding;
    public UpdateAnsweringRuleRequest forwarding(ForwardingInfo forwarding) {
        this.forwarding = forwarding;
        return this;
    }
    // Unconditional forwarding parameters. Returned if 'UnconditionalForwarding' is specified in 'callHandlingAction'
    public UnconditionalForwardingInfo unconditionalForwarding;
    public UpdateAnsweringRuleRequest unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }
    // Queue settings applied for department (call queue) extension type, with the 'AgentQueue' value specified as a call handling action
    public QueueInfo queue;
    public UpdateAnsweringRuleRequest queue(QueueInfo queue) {
        this.queue = queue;
        return this;
    }
    // Specifies whether to take a voicemail and who should do it
    public VoicemailInfo voicemail;
    public UpdateAnsweringRuleRequest voicemail(VoicemailInfo voicemail) {
        this.voicemail = voicemail;
        return this;
    }
    // Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
    public GreetingInfo[] greetings;
    public UpdateAnsweringRuleRequest greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }
}
