package com.ringcentral.definitions;


public class CreateAnsweringRuleRequest {
    /**
     * Specifies if the rule is active or inactive. The default value is 'True'
     */
    public Boolean enabled;
    /**
     * Type of an answering rule. The 'Custom' value should be specified
     * Required
     */
    public String type;
    /**
     * Name of an answering rule specified by user
     * Required
     */
    public String name;
    /**
     * Answering rule will be applied when calls are received from the specified caller(s)
     */
    public CallersInfoRequest[] callers;
    /**
     * Answering rules are applied when calling to selected number(s)
     */
    public CalledNumberInfo[] calledNumbers;
    /**
     * Schedule when an answering rule should be applied
     */
    public ScheduleInfo schedule;
    /**
     * Specifies how incoming calls are forwarded
     * Enum: ForwardCalls, UnconditionalForwarding, AgentQueue, TransferToExtension, TakeMessagesOnly, PlayAnnouncementOnly
     */
    public String callHandlingAction;
    /**
     * Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
     */
    public ForwardingInfo forwarding;
    /**
     * Unconditional forwarding parameters. Returned if 'UnconditionalForwarding' is specified in 'callHandlingAction'
     */
    public UnconditionalForwardingInfo unconditionalForwarding;
    /**
     * Queue settings applied for department (call queue) extension type, with the 'AgentQueue' value specified as a call handling action
     */
    public QueueInfo queue;
    /**
     * Transfer settings applied for department (call queue) extension type, with 'TransferToExtension' call handling action
     */
    public TransferredExtensionInfo transfer;
    /**
     * Specifies whether to take a voicemail and who should do it
     */
    public VoicemailInfo voicemail;
    /**
     * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;
    /**
     * Call screening status. 'Off' - no call screening; 'NoCallerId' - if caller ID is missing, then callers are asked to say their name before connecting; 'UnknownCallerId' - if caller ID is not in contact list, then callers are asked to say their name before connecting; 'Always' - the callers are always asked to say their name before connecting. The default value is 'Off'
     * Enum: Off, NoCallerId, UnknownCallerId, Always
     */
    public String screening;

    public CreateAnsweringRuleRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CreateAnsweringRuleRequest type(String type) {
        this.type = type;
        return this;
    }

    public CreateAnsweringRuleRequest name(String name) {
        this.name = name;
        return this;
    }

    public CreateAnsweringRuleRequest callers(CallersInfoRequest[] callers) {
        this.callers = callers;
        return this;
    }

    public CreateAnsweringRuleRequest calledNumbers(CalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public CreateAnsweringRuleRequest schedule(ScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

    public CreateAnsweringRuleRequest callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    public CreateAnsweringRuleRequest forwarding(ForwardingInfo forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    public CreateAnsweringRuleRequest unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }

    public CreateAnsweringRuleRequest queue(QueueInfo queue) {
        this.queue = queue;
        return this;
    }

    public CreateAnsweringRuleRequest transfer(TransferredExtensionInfo transfer) {
        this.transfer = transfer;
        return this;
    }

    public CreateAnsweringRuleRequest voicemail(VoicemailInfo voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public CreateAnsweringRuleRequest greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }

    public CreateAnsweringRuleRequest screening(String screening) {
        this.screening = screening;
        return this;
    }

}
