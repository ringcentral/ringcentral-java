package com.ringcentral.definitions;


public class AnsweringRuleInfo
{
    /**
         * Canonical URI to an answering rule resource
         */
        public String uri;
  public AnsweringRuleInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of an answering rule
         */
        public String id;
  public AnsweringRuleInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Type of an answering rule
         * Enum: BusinessHours, AfterHours, Custom
         */
        public String type;
  public AnsweringRuleInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Name of an answering rule specified by user
         */
        public String name;
  public AnsweringRuleInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Specifies if an answering rule is active or inactive
         */
        public Boolean enabled;
  public AnsweringRuleInfo enabled(Boolean enabled)
  {
    this.enabled = enabled;
    return this;
  }
  

        /**
         */
        public ScheduleInfo schedule;
  public AnsweringRuleInfo schedule(ScheduleInfo schedule)
  {
    this.schedule = schedule;
    return this;
  }
  

        /**
         * Answering rules are applied when calling to selected number(s)
         */
        public CalledNumberInfo[] calledNumbers;
  public AnsweringRuleInfo calledNumbers(CalledNumberInfo[] calledNumbers)
  {
    this.calledNumbers = calledNumbers;
    return this;
  }
  

        /**
         * Answering rules are applied when calls are received from specified caller(s)
         */
        public CallersInfo[] callers;
  public AnsweringRuleInfo callers(CallersInfo[] callers)
  {
    this.callers = callers;
    return this;
  }
  

        /**
         * Specifies how incoming calls are forwarded
         * Enum: ForwardCalls, UnconditionalForwarding, AgentQueue, TransferToExtension, TakeMessagesOnly, PlayAnnouncementOnly, SharedLines
         */
        public String callHandlingAction;
  public AnsweringRuleInfo callHandlingAction(String callHandlingAction)
  {
    this.callHandlingAction = callHandlingAction;
    return this;
  }
  

        /**
         */
        public ForwardingInfo forwarding;
  public AnsweringRuleInfo forwarding(ForwardingInfo forwarding)
  {
    this.forwarding = forwarding;
    return this;
  }
  

        /**
         */
        public UnconditionalForwardingInfo unconditionalForwarding;
  public AnsweringRuleInfo unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding)
  {
    this.unconditionalForwarding = unconditionalForwarding;
    return this;
  }
  

        /**
         */
        public QueueInfo queue;
  public AnsweringRuleInfo queue(QueueInfo queue)
  {
    this.queue = queue;
    return this;
  }
  

        /**
         */
        public TransferredExtensionInfo transfer;
  public AnsweringRuleInfo transfer(TransferredExtensionInfo transfer)
  {
    this.transfer = transfer;
    return this;
  }
  

        /**
         */
        public VoicemailInfo voicemail;
  public AnsweringRuleInfo voicemail(VoicemailInfo voicemail)
  {
    this.voicemail = voicemail;
    return this;
  }
  

        /**
         * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
         */
        public GreetingInfo[] greetings;
  public AnsweringRuleInfo greetings(GreetingInfo[] greetings)
  {
    this.greetings = greetings;
    return this;
  }
  

        /**
         * Call screening status. 'Off' - no call screening; 'NoCallerId' - if caller ID is missing, then callers are asked to say their name before connecting; 'UnknownCallerId' - if caller ID is not in contact list, then callers are asked to say their name before connecting; 'Always' - the callers are always asked to say their name before connecting. The default value is 'Off'
         * Enum: Off, NoCallerId, UnknownCallerId, Always
         */
        public String screening;
  public AnsweringRuleInfo screening(String screening)
  {
    this.screening = screening;
    return this;
  }
  

        /**
         */
        public SharedLinesInfo sharedLines;
  public AnsweringRuleInfo sharedLines(SharedLinesInfo sharedLines)
  {
    this.sharedLines = sharedLines;
    return this;
  }
  
}
