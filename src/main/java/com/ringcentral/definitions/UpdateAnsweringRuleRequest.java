package com.ringcentral.definitions;


public class UpdateAnsweringRuleRequest
{
    /**
     * Identifier of an answering rule
     */
    public String id;
    public UpdateAnsweringRuleRequest id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public ForwardingInfoCreateRuleRequest forwarding;
    public UpdateAnsweringRuleRequest forwarding(ForwardingInfoCreateRuleRequest forwarding)
    {
        this.forwarding = forwarding;
        return this;
    }

    /**
     * Specifies if the rule is active or inactive. The default value is &#039;True&#039;
     */
    public Boolean enabled;
    public UpdateAnsweringRuleRequest enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Name of an answering rule specified by user
     */
    public String name;
    public UpdateAnsweringRuleRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Answering rule will be applied when calls are received from the specified caller(s)
     */
    public CallersInfoRequest[] callers;
    public UpdateAnsweringRuleRequest callers(CallersInfoRequest[] callers)
    {
        this.callers = callers;
        return this;
    }

    /**
     * Answering rules are applied when calling to selected number(s)
     */
    public CalledNumberInfo[] calledNumbers;
    public UpdateAnsweringRuleRequest calledNumbers(CalledNumberInfo[] calledNumbers)
    {
        this.calledNumbers = calledNumbers;
        return this;
    }

    /**
     */
    public ScheduleInfo schedule;
    public UpdateAnsweringRuleRequest schedule(ScheduleInfo schedule)
    {
        this.schedule = schedule;
        return this;
    }

    /**
     * Specifies how incoming calls are forwarded
     * Enum: ForwardCalls, UnconditionalForwarding, AgentQueue, TransferToExtension, TakeMessagesOnly, PlayAnnouncementOnly, SharedLines
     */
    public String callHandlingAction;
    public UpdateAnsweringRuleRequest callHandlingAction(String callHandlingAction)
    {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    /**
     * Type of an answering rule
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
    public UpdateAnsweringRuleRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public UnconditionalForwardingInfo unconditionalForwarding;
    public UpdateAnsweringRuleRequest unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding)
    {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }

    /**
     */
    public QueueInfo queue;
    public UpdateAnsweringRuleRequest queue(QueueInfo queue)
    {
        this.queue = queue;
        return this;
    }

    /**
     */
    public VoicemailInfo voicemail;
    public UpdateAnsweringRuleRequest voicemail(VoicemailInfo voicemail)
    {
        this.voicemail = voicemail;
        return this;
    }

    /**
     */
    public MissedCallInfo missedCall;
    public UpdateAnsweringRuleRequest missedCall(MissedCallInfo missedCall)
    {
        this.missedCall = missedCall;
        return this;
    }

    /**
     * Greetings applied for an answering rule; only predefined greetings
    * can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;
    public UpdateAnsweringRuleRequest greetings(GreetingInfo[] greetings)
    {
        this.greetings = greetings;
        return this;
    }

    /**
     * Call screening status. &#039;Off&#039; - no call screening; &#039;NoCallerId&#039;
    * - if caller ID is missing, then callers are asked to say their name before
    * connecting; &#039;UnknownCallerId&#039; - if caller ID is not in contact list, then
    * callers are asked to say their name before connecting; &#039;Always&#039; - the
    * callers are always asked to say their name before connecting. The default
    * value is &#039;Off&#039;
     * Enum: false, NoCallerId, UnknownCallerId, Always
     */
    public String screening;
    public UpdateAnsweringRuleRequest screening(String screening)
    {
        this.screening = screening;
        return this;
    }

    /**
     * Indicates whether inactive numbers should be returned or not
     */
    public Boolean showInactiveNumbers;
    public UpdateAnsweringRuleRequest showInactiveNumbers(Boolean showInactiveNumbers)
    {
        this.showInactiveNumbers = showInactiveNumbers;
        return this;
    }

    /**
     */
    public TransferredExtensionInfo transfer;
    public UpdateAnsweringRuleRequest transfer(TransferredExtensionInfo transfer)
    {
        this.transfer = transfer;
        return this;
    }
}