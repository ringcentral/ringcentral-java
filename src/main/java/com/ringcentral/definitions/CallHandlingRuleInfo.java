package com.ringcentral.definitions;


public class CallHandlingRuleInfo {
    /**
     * Canonical URI to an answering rule resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of an answering rule
     */
    public String id;
    /**
     * Type of an answering rule
     * Default: Custom
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
    /**
     * Name of an answering rule specified by user
     */
    public String name;
    /**
     * Specifies if an answering rule is active or inactive
     */
    public Boolean enabled;
    /**
     *
     */
    public ScheduleInfo schedule;
    /**
     * Answering rules are applied when calling to selected number(s)
     */
    public CalledNumberInfo[] calledNumbers;
    /**
     * Answering rules are applied when calls are received from specified caller(s)
     */
    public CallersInfo[] callers;
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
     * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;
    /**
     * Call screening status. &#039;Off&#039; - no call screening; &#039;NoCallerId&#039; - if caller ID is missing, then callers are asked to say their name before connecting; &#039;UnknownCallerId&#039; - if caller ID is not in contact list, then callers are asked to say their name before connecting; &#039;Always&#039; - the callers are always asked to say their name before connecting. The default value is &#039;Off&#039;
     * Default: Off
     * Enum: Off, NoCallerId, UnknownCallerId, Always
     */
    public String screening;
    /**
     *
     */
    public SharedLinesInfo sharedLines;
    /**
     *
     */
    public MissedCallInfo missedCall;

    public CallHandlingRuleInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallHandlingRuleInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallHandlingRuleInfo type(String type) {
        this.type = type;
        return this;
    }

    public CallHandlingRuleInfo name(String name) {
        this.name = name;
        return this;
    }

    public CallHandlingRuleInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CallHandlingRuleInfo schedule(ScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

    public CallHandlingRuleInfo calledNumbers(CalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public CallHandlingRuleInfo callers(CallersInfo[] callers) {
        this.callers = callers;
        return this;
    }

    public CallHandlingRuleInfo callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    public CallHandlingRuleInfo forwarding(ForwardingInfo forwarding) {
        this.forwarding = forwarding;
        return this;
    }

    public CallHandlingRuleInfo unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding) {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }

    public CallHandlingRuleInfo queue(QueueInfo queue) {
        this.queue = queue;
        return this;
    }

    public CallHandlingRuleInfo transfer(TransferredExtensionInfo transfer) {
        this.transfer = transfer;
        return this;
    }

    public CallHandlingRuleInfo voicemail(VoicemailInfo voicemail) {
        this.voicemail = voicemail;
        return this;
    }

    public CallHandlingRuleInfo greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }

    public CallHandlingRuleInfo screening(String screening) {
        this.screening = screening;
        return this;
    }

    public CallHandlingRuleInfo sharedLines(SharedLinesInfo sharedLines) {
        this.sharedLines = sharedLines;
        return this;
    }

    public CallHandlingRuleInfo missedCall(MissedCallInfo missedCall) {
        this.missedCall = missedCall;
        return this;
    }
}
