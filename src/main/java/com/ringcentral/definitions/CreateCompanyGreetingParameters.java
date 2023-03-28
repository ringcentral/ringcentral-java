package com.ringcentral.definitions;


/**
 * Query parameters for operation createCompanyGreeting
 */
public class CreateCompanyGreetingParameters {
    /**
     *
     */
    public CustomCompanyGreetingAnsweringRuleInfo answeringRule;

    public CreateCompanyGreetingParameters answeringRule(CustomCompanyGreetingAnsweringRuleInfo answeringRule) {
        this.answeringRule = answeringRule;
        return this;
    }
}
