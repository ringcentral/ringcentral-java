package com.ringcentral.definitions;


public class UpdateAnsweringRuleRequest {
    /**
     * Identifier of an answering rule
     */
    public String id;
    /**
     *
     */
    public ForwardingInfoCreateRuleRequest forwarding;
    /**
     * Specifies if the rule is active or inactive. The default value is &#039;True&#039;
     */
    public Boolean enabled;
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
     * Type of an answering rule
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
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
    public VoicemailInfo voicemail;
    /**
     *
     */
    public MissedCallInfo missedCall;
    /**
     * Greetings applied for an answering rule; only predefined greetings
     * can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;
    /**
     * Call screening status. &#039;Off&#039; - no call screening; &#039;NoCallerId&#039;
     * - if caller ID is missing, then callers are asked to say their name before
     * connecting; &#039;UnknownCallerId&#039; - if caller ID is not in contact list, then
     * callers are asked to say their name before connecting; &#039;Always&#039; - the
     * callers are always asked to say their name before connecting. The default
     * value is &#039;Off&#039;
     * Default: Off
     * Enum: Off, NoCallerId, UnknownCallerId, Always
     */
    public String screening;
    /**
     * Indicates whether inactive numbers should be returned or not
     */
    public Boolean showInactiveNumbers;
    /**
     *
     */
    public TransferredExtensionInfo transfer;

    public UpdateAnsweringRuleRequest id(String id) {
        this.id = id;
        return this;
    }

    public UpdateAnsweringRuleRequest forwarding(ForwardingInfoCreateRuleRequest forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    public UpdateAnsweringRuleRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public UpdateAnsweringRuleRequest name(String name) {
        this.name = name;
        return this;
    }

    public UpdateAnsweringRuleRequest callers(CallersInfoRequest[] callers) {
        this.callers = callers;
        return this;
    }

    public UpdateAnsweringRuleRequest calledNumbers(CalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public UpdateAnsweringRuleRequest schedule(ScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

    public UpdateAnsweringRuleRequest callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    public UpdateAnsweringRuleRequest type(String type) {
        this.type = type;
        return this;
    }

    public UpdateAnsweringRuleRequest unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }

    public UpdateAnsweringRuleRequest queue(QueueInfo queue) {
        this.queue = queue;
        return this;
    }

    public UpdateAnsweringRuleRequest voicemail(VoicemailInfo voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public UpdateAnsweringRuleRequest missedCall(MissedCallInfo missedCall) {
        this.missedCall = missedCall;
        return this;
    }

    public UpdateAnsweringRuleRequest greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }

    public UpdateAnsweringRuleRequest screening(String screening) {
        this.screening = screening;
        return this;
    }

    public UpdateAnsweringRuleRequest showInactiveNumbers(Boolean showInactiveNumbers) {
        this.showInactiveNumbers = showInactiveNumbers;
        return this;
    }

    public UpdateAnsweringRuleRequest transfer(TransferredExtensionInfo transfer) {
        this.transfer = transfer;
        return this;
    }
}
