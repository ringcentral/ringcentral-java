package com.ringcentral.definitions;


public class AnsweringRuleInfo {
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

    public AnsweringRuleInfo calledNumbers(CalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public AnsweringRuleInfo callers(CallersInfo[] callers) {
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

    public AnsweringRuleInfo queue(QueueInfo queue) {
        this.queue = queue;
        return this;
    }

    public AnsweringRuleInfo transfer(TransferredExtensionInfo transfer) {
        this.transfer = transfer;
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

    public AnsweringRuleInfo screening(String screening) {
        this.screening = screening;
        return this;
    }

    public AnsweringRuleInfo sharedLines(SharedLinesInfo sharedLines) {
        this.sharedLines = sharedLines;
        return this;
    }

    public AnsweringRuleInfo missedCall(MissedCallInfo missedCall) {
        this.missedCall = missedCall;
        return this;
    }
}
