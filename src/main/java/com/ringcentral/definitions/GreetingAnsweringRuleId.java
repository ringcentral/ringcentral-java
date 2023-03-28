package com.ringcentral.definitions;


/**
 * Greeting's answering rule id
 */
public class GreetingAnsweringRuleId {
    /**
     * Internal identifier of an answering rule
     */
    public String id;

    public GreetingAnsweringRuleId id(String id) {
        this.id = id;
        return this;
    }
}
