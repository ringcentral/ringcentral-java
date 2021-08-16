package com.ringcentral.definitions;


public class CreateAnsweringRuleRequest {
    /**
     * Specifies if the rule is active or inactive. The default value is &#039;True&#039;
     */
    public Boolean enabled;
    /**
     * Type of an answering rule. The &#039;Custom&#039; value should be specified
     */
    public String type;
    /**
     * Name of an answering rule specified by user
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
     *
     */
    public ScheduleInfo schedule;
    /**
     * Specifies how incoming calls are forwarded
     * Enum: ForwardCalls, UnconditionalForwarding, AgentQueue, TransferToExtension, TakeMessagesOnly, PlayAnnouncementOnly, SharedLines
     */
    public String callHandlingAction;
    /**
     *
     */
    public ForwardingInfo forwarding;
    /**
     *
     */
    public UnconditionalForwardingInfo unconditionalForwarding;
    /**
     *
     */
    public QueueInfo queue;
    /**
     *
     */
    public TransferredExtensionInfo transfer;
    /**
     *
     */
    public VoicemailInfo voicemail;
    /**
     *
     */
    public MissedCallInfo missedCall;
    /**
     * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;
    /**
     * Call screening status. &#039;Off&#039; - no call screening; &#039;NoCallerId&#039; - if caller ID is missing, then callers are asked to say their name before connecting; &#039;UnknownCallerId&#039; - if caller ID is not in contact list, then callers are asked to say their name before connecting; &#039;Always&#039; - the callers are always asked to say their name before connecting. The default value is &#039;Off&#039;
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

    public CreateAnsweringRuleRequest missedCall(MissedCallInfo missedCall) {
        this.missedCall = missedCall;
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
