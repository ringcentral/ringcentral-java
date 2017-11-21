package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AnsweringRuleResource
{
    //
    public String uri;
    public AnsweringRuleResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public AnsweringRuleResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String type;
    public AnsweringRuleResource type(String type) {
        this.type = type;
        return this;
    }
    //
    public String name;
    public AnsweringRuleResource name(String name) {
        this.name = name;
        return this;
    }
    //
    public Boolean enabled;
    public AnsweringRuleResource enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    //
    public ScheduleResource schedule;
    public AnsweringRuleResource schedule(ScheduleResource schedule) {
        this.schedule = schedule;
        return this;
    }
    //
    public CallerResource[] callers;
    public AnsweringRuleResource callers(CallerResource[] callers) {
        this.callers = callers;
        return this;
    }
    //
    public PhoneNumberResource[] calledNumbers;
    public AnsweringRuleResource calledNumbers(PhoneNumberResource[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }
    //
    public String callHandlingAction;
    public AnsweringRuleResource callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }
    //
    public AnsweringForwardingResource forwarding;
    public AnsweringRuleResource forwarding(AnsweringForwardingResource forwarding) {
        this.forwarding = forwarding;
        return this;
    }
    //
    public UnconditionalForwardingResource unconditionalForwarding;
    public AnsweringRuleResource unconditionalForwarding(UnconditionalForwardingResource unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }
    //
    public VoicemailSettingsResource voicemail;
    public AnsweringRuleResource voicemail(VoicemailSettingsResource voicemail) {
        this.voicemail = voicemail;
        return this;
    }
}
