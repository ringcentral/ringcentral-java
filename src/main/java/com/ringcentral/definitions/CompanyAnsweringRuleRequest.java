package com.ringcentral.definitions;


public class CompanyAnsweringRuleRequest {
    /**
     * Name of an answering rule specified by user. Max number of symbols is 30. The default value is 'My Rule N' where 'N' is the first free number
     */
    public String name;
    /**
     * Specifies if the rule is active or inactive. The default value is 'True'
     * Default: true
     */
    public Boolean enabled;
    /**
     * Type of an answering rule, the default value is 'Custom' = ['BusinessHours', 'AfterHours', 'Custom']
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
    /**
     * Answering rule will be applied when calls are received from the specified caller(s)
     */
    public CompanyAnsweringRuleCallersInfoRequest[] callers;
    /**
     * Answering rule will be applied when calling the specified number(s)
     */
    public CompanyAnsweringRuleCalledNumberInfo[] calledNumbers;
    /**
     * Schedule when an answering rule should be applied
     */
    public CompanyAnsweringRuleScheduleInfoRequest schedule;
    /**
     * Specifies how incoming calls are forwarded. The default value is 'Operator' 'Operator' - play company greeting and forward to operator extension 'Disconnect' - play company greeting and disconnect 'Bypass' - bypass greeting to go to selected extension = ['Operator', 'Disconnect', 'Bypass']
     * Enum: Operator, Disconnect, Bypass
     */
    public String callHandlingAction;
    /**
     * Extension to which the call is forwarded in 'Bypass' mode
     */
    public CompanyAnsweringRuleCallersInfoRequest extension;
    /**
     * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;

    public CompanyAnsweringRuleRequest name(String name) {
        this.name = name;
        return this;
    }

    public CompanyAnsweringRuleRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CompanyAnsweringRuleRequest type(String type) {
        this.type = type;
        return this;
    }

    public CompanyAnsweringRuleRequest callers(CompanyAnsweringRuleCallersInfoRequest[] callers) {
        this.callers = callers;
        return this;
    }

    public CompanyAnsweringRuleRequest calledNumbers(CompanyAnsweringRuleCalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public CompanyAnsweringRuleRequest schedule(CompanyAnsweringRuleScheduleInfoRequest schedule) {
        this.schedule = schedule;
        return this;
    }

    public CompanyAnsweringRuleRequest callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    public CompanyAnsweringRuleRequest extension(CompanyAnsweringRuleCallersInfoRequest extension) {
        this.extension = extension;
        return this;
    }

    public CompanyAnsweringRuleRequest greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }

}
