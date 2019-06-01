package com.ringcentral.definitions;


public class CustomGreetingAnsweringRuleInfo {
    /**
     * Canonical URI of an answering rule
     */
    public String uri;
    /**
     * Internal identifier of an answering rule
     */
    public String id;

    public CustomGreetingAnsweringRuleInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CustomGreetingAnsweringRuleInfo id(String id) {
        this.id = id;
        return this;
    }

}
