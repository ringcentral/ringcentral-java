package com.ringcentral.definitions;


public class CompanyAnsweringRuleInfo {
    /**
     * Internal identifier of an answering rule
     */
    public String id;
    /**
     * Canonical URI of an answering rule
     */
    public String uri;
    /**
     * Specifies if the rule is active or inactive
     * Default: true
     */
    public Boolean enabled;
    /**
     * Type of an answering rule
     * Default: Custom
     * Enum: BusinessHours, AfterHours, Custom
     */
    public String type;
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
    public CompanyAnsweringRuleCalledNumberInfoRequest[] calledNumbers;
    /**
     *
     */
    public CompanyAnsweringRuleScheduleInfo schedule;
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

    public CompanyAnsweringRuleInfo id(String id) {
        this.id = id;
        return this;
    }

    public CompanyAnsweringRuleInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CompanyAnsweringRuleInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public CompanyAnsweringRuleInfo type(String type) {
        this.type = type;
        return this;
    }

    public CompanyAnsweringRuleInfo name(String name) {
        this.name = name;
        return this;
    }

    public CompanyAnsweringRuleInfo callers(CompanyAnsweringRuleCallersInfoRequest[] callers) {
        this.callers = callers;
        return this;
    }

    public CompanyAnsweringRuleInfo calledNumbers(CompanyAnsweringRuleCalledNumberInfoRequest[] calledNumbers) {
        this.calledNumbers = calledNumbers;
        return this;
    }

    public CompanyAnsweringRuleInfo schedule(CompanyAnsweringRuleScheduleInfo schedule) {
        this.schedule = schedule;
        return this;
    }

    public CompanyAnsweringRuleInfo callHandlingAction(String callHandlingAction) {
        this.callHandlingAction = callHandlingAction;
        return this;
    }

    public CompanyAnsweringRuleInfo extension(CompanyAnsweringRuleExtensionInfoRequest extension) {
        this.extension = extension;
        return this;
    }

    public CompanyAnsweringRuleInfo greetings(GreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }
}
