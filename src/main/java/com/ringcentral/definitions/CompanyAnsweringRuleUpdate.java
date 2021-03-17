package com.ringcentral.definitions;


public class CompanyAnsweringRuleUpdate
{
    /**
         * Specifies if the rule is active or inactive. The default value is 'True'
         * Default: true
         */
        public Boolean enabled;
  public CompanyAnsweringRuleUpdate enabled(Boolean enabled)
  {
    this.enabled = enabled;
    return this;
  }
  

        /**
         * Name of an answering rule specified by user. Max number of symbols is 30. The default value is 'My Rule N' where 'N' is the first free number
         */
        public String name;
  public CompanyAnsweringRuleUpdate name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Answering rule will be applied when calls are received from the specified caller(s)
         */
        public CompanyAnsweringRuleCallersInfoRequest[] callers;
  public CompanyAnsweringRuleUpdate callers(CompanyAnsweringRuleCallersInfoRequest[] callers)
  {
    this.callers = callers;
    return this;
  }
  

        /**
         * Answering rule will be applied when calling the specified number(s)
         */
        public CompanyAnsweringRuleCalledNumberInfo[] calledNumbers;
  public CompanyAnsweringRuleUpdate calledNumbers(CompanyAnsweringRuleCalledNumberInfo[] calledNumbers)
  {
    this.calledNumbers = calledNumbers;
    return this;
  }
  

        /**
         */
        public CompanyAnsweringRuleScheduleInfoRequest schedule;
  public CompanyAnsweringRuleUpdate schedule(CompanyAnsweringRuleScheduleInfoRequest schedule)
  {
    this.schedule = schedule;
    return this;
  }
  

        /**
         * Specifies how incoming calls are forwarded. The default value is 'Operator' 'Operator' - play company greeting and forward to operator extension 'Disconnect' - play company greeting and disconnect 'Bypass' - bypass greeting to go to selected extension = ['Operator', 'Disconnect','Bypass']
         * Enum: Operator, Disconnect, Bypass
         */
        public String callHandlingAction;
  public CompanyAnsweringRuleUpdate callHandlingAction(String callHandlingAction)
  {
    this.callHandlingAction = callHandlingAction;
    return this;
  }
  

        /**
         * Type of an answering rule
         * Default: Custom
         * Enum: BusinessHours, AfterHours, Custom
         */
        public String type;
  public CompanyAnsweringRuleUpdate type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Internal identifier of the extension the call is forwarded to. Supported for 'Bypass' mode only (that should be specified in `callHandlingAction` field)
         */
        public String extension;
  public CompanyAnsweringRuleUpdate extension(String extension)
  {
    this.extension = extension;
    return this;
  }
  

        /**
         * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
         */
        public GreetingInfo[] greetings;
  public CompanyAnsweringRuleUpdate greetings(GreetingInfo[] greetings)
  {
    this.greetings = greetings;
    return this;
  }
  
}
