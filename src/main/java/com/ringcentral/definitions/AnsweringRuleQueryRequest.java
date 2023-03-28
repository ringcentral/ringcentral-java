package com.ringcentral.definitions;


public class AnsweringRuleQueryRequest {
    /**
     * Internal identifier of an answering rule
     */
    public String id;

    public AnsweringRuleQueryRequest id(String id) {
        this.id = id;
        return this;
    }
}
