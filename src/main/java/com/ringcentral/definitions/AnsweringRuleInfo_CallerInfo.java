package com.ringcentral.definitions;

public class AnsweringRuleInfo_CallerInfo {
    // Phone number of a caller
    public String callerId;
    // Contact name of a caller
    public String name;

    public AnsweringRuleInfo_CallerInfo callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }

    public AnsweringRuleInfo_CallerInfo name(String name) {
        this.name = name;
        return this;
    }
}
