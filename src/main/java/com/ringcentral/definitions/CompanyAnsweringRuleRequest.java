package com.ringcentral.definitions;


public class CompanyAnsweringRuleRequest {
    /**
     * Name of an answering rule specified by user. Max number of symbols is 30. The default value is &#039;My Rule N&#039; where &#039;N&#039; is the first free number
     */
    public String name;
    /**
     * Specifies if the rule is active or inactive. The default value is `true`
     * Default: true
     */
    public Boolean enabled;
    /**
     * Type of an answering rule, the default value is &#039;Custom&#039; = [&#039;BusinessHours&#039;, &#039;AfterHours&#039;, &#039;Custom&#039;]
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
     *
     */
    public CompanyAnsweringRuleScheduleInfoRequest schedule;
    /**
     * Specifies how incoming calls are forwarded. The default value is &#039;Operator&#039; &#039;Operator&#039; - play company greeting and forward to operator extension &#039;Disconnect&#039; - play company greeting and disconnect &#039;Bypass&#039; - bypass greeting to go to selected extension = [&#039;Operator&#039;, &#039;Disconnect&#039;, &#039;Bypass&#039;]
     * Enum: Operator, Disconnect, Bypass
     */
    public String callHandlingAction;
    /**
     *
     */
    public CompanyAnsweringRuleExtensionInfoRequest extension;
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

    public CompanyAnsweringRuleRequest extension(CompanyAnsweringRuleExtensionInfoRequest extension) {
        this.extension = extension;
        return this;
    }

    public CompanyAnsweringRuleRequest greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }
}
