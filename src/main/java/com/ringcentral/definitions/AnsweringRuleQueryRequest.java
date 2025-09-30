package com.ringcentral.definitions;


/**
 * This parameter is not supported for all User type extensions if the new call handling service
 * is activated on account
 */
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
