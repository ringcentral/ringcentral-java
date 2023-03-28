package com.ringcentral.definitions;


/**
 * Query parameters for operation createCustomUserGreeting
 */
public class CreateCustomUserGreetingParameters {
    /**
     * Specifies whether to apply an answering rule or not. If set to
     * true then `answeringRule` parameter is mandatory. If set to false, then
     * the answering rule is not applied even if specified
     * Default: true
     */
    public Boolean apply;

    public CreateCustomUserGreetingParameters apply(Boolean apply) {
        this.apply = apply;
        return this;
    }
}
