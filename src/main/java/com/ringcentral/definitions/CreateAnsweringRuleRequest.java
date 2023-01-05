package com.ringcentral.definitions;


public class CreateAnsweringRuleRequest
{
    /**
     * Specifies if the rule is active or inactive. The default value is &#039;True&#039;
     */
    public Boolean enabled;
    public CreateAnsweringRuleRequest enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Type of an answering rule. The &#039;Custom&#039; value should be specified
     * Required
     */
    public String type;
    public CreateAnsweringRuleRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Name of an answering rule specified by user
     * Required
     */
    public String name;
    public CreateAnsweringRuleRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Answering rule will be applied when calls are received from the specified caller(s)
     */
    public CallersInfoRequest[] callers;
    public CreateAnsweringRuleRequest callers(CallersInfoRequest[] callers)
    {
        this.callers = callers;
        return this;
    }

    /**
     * Answering rules are applied when calling to selected number(s)
     */
    public CalledNumberInfo[] calledNumbers;
    public CreateAnsweringRuleRequest calledNumbers(CalledNumberInfo[] calledNumbers)
    {
        this.calledNumbers = calledNumbers;
        return this;
    }

    /**
     */
    public ScheduleInfo schedule;
    public CreateAnsweringRuleRequest schedule(ScheduleInfo schedule)
    {
        this.schedule = schedule;
        return this;
    }

    /**
     * Specifies how incoming calls are forwarded
     * Enum: ForwardCalls, UnconditionalForwarding, AgentQueue, TransferToExtension, TakeMessagesOnly, PlayAnnouncementOnly, SharedLines
     */
    public String callHandlingAction;
    public CreateAnsweringRuleRequest callHandlingAction(String callHandlingAction)
    {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    /**
     */
    public ForwardingInfo forwarding;
    public CreateAnsweringRuleRequest forwarding(ForwardingInfo forwarding)
    {
        this.forwarding = forwarding;
        return this;
    }

    /**
     */
    public UnconditionalForwardingInfo unconditionalForwarding;
    public CreateAnsweringRuleRequest unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding)
    {
        this.unconditionalForwarding = unconditionalForwarding;
        return this;
    }

    /**
     */
    public QueueInfo queue;
    public CreateAnsweringRuleRequest queue(QueueInfo queue)
    {
        this.queue = queue;
        return this;
    }

    /**
     */
    public TransferredExtensionInfo transfer;
    public CreateAnsweringRuleRequest transfer(TransferredExtensionInfo transfer)
    {
        this.transfer = transfer;
        return this;
    }

    /**
     */
    public VoicemailInfo voicemail;
    public CreateAnsweringRuleRequest voicemail(VoicemailInfo voicemail)
    {
        this.voicemail = voicemail;
        return this;
    }

    /**
     */
    public MissedCallInfo missedCall;
    public CreateAnsweringRuleRequest missedCall(MissedCallInfo missedCall)
    {
        this.missedCall = missedCall;
        return this;
    }

    /**
     * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;
    public CreateAnsweringRuleRequest greetings(GreetingInfo[] greetings)
    {
        this.greetings = greetings;
        return this;
    }

    /**
     * Call screening status. &#039;Off&#039; - no call screening; &#039;NoCallerId&#039; - if caller ID is missing, then callers are asked to say their name before connecting; &#039;UnknownCallerId&#039; - if caller ID is not in contact list, then callers are asked to say their name before connecting; &#039;Always&#039; - the callers are always asked to say their name before connecting. The default value is &#039;Off&#039;
     * Enum: Off, NoCallerId, UnknownCallerId, Always
     */
    public String screening;
    public CreateAnsweringRuleRequest screening(String screening)
    {
        this.screening = screening;
        return this;
    }
}