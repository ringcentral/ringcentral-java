package com.ringcentral.definitions;


public class CompanyAnsweringRuleUpdate {
    /**
     * Specifies if the rule is active or inactive. The default value is &#039;True&#039;
     * Default: true
     */
    public Boolean enabled;
    /**
     * Name of an answering rule specified by user. Max number of symbols is 30. The default value is &#039;My Rule N&#039; where &#039;N&#039; is the first free number
     */
    public String name;
    /**
     * Answering rule will be applied when calls are received from the specified caller(s)
     */
    public CompanyAnsweringRuleCallersInfoRequest[] callers;
    /**
     * Answering rule will be applied when calling the specified number(s)
     */
    public CompanyAnsweringRuleCalledNumberInfo[] calledNumbers;
    /**
     *
     */
    public CompanyAnsweringRuleScheduleInfoRequest schedule;
    /**
     * Specifies how incoming calls are forwarded. The default value is &#039;Operator&#039; &#039;Operator&#039; - play company greeting and forward to operator extension &#039;Disconnect&#039; - play company greeting and disconnect &#039;Bypass&#039; - bypass greeting to go to selected extension = [&#039;Operator&#039;, &#039;Disconnect&#039;,&#039;Bypass&#039;]
     * Enum: Operator, Disconnect, Bypass
     */
    public String callHandlingAction;
    /**
     * Type of an answering rule
     * Default: Custom
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
    /**
     * Internal identifier of the extension the call is forwarded to. Supported for &#039;Bypass&#039; mode only (that should be specified in `callHandlingAction` field)
     */
    public String extension;
    /**
     * Greetings applied for an answering rule; only predefined greetings can be applied, see Dictionary Greeting List
     */
    public GreetingInfo[] greetings;

    public CompanyAnsweringRuleUpdate enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CompanyAnsweringRuleUpdate name(String name) {
        this.name = name;
        return this;
    }

    public CompanyAnsweringRuleUpdate callers(CompanyAnsweringRuleCallersInfoRequest[] callers) {
        this.callers = callers;
        return this;
    }

    public CompanyAnsweringRuleUpdate calledNumbers(CompanyAnsweringRuleCalledNumberInfo[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public CompanyAnsweringRuleUpdate schedule(CompanyAnsweringRuleScheduleInfoRequest schedule) {
        this.schedule = schedule;
        return this;
    }

    public CompanyAnsweringRuleUpdate callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    public CompanyAnsweringRuleUpdate type(String type) {
        this.type = type;
        return this;
    }

    public CompanyAnsweringRuleUpdate extension(String extension) {
        this.extension = extension;
        return this;
    }

    public CompanyAnsweringRuleUpdate greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }
}
