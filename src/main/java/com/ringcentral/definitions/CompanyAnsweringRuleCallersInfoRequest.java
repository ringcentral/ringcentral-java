package com.ringcentral.definitions;


public class CompanyAnsweringRuleCallersInfoRequest {
    /**
     * Phone number of a caller
     */
    public String callerId;
    /**
     * Displayed name for a caller ID
     */
    public String name;

    public CompanyAnsweringRuleCallersInfoRequest callerId(String callerId) {
        this.callerId = callerId;
        return this;
    }

    public CompanyAnsweringRuleCallersInfoRequest name(String name) {
        this.name = name;
        return this;
    }

}
