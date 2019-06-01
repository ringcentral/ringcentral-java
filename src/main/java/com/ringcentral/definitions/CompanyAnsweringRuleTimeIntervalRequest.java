package com.ringcentral.definitions;


public class CompanyAnsweringRuleTimeIntervalRequest {
    /**
     * Time in format hh:mm
     */
    public String from;
    /**
     * Time in format hh:mm
     */
    public String to;

    public CompanyAnsweringRuleTimeIntervalRequest from(String from) {
        this.from = from;
        return this;
    }

    public CompanyAnsweringRuleTimeIntervalRequest to(String to) {
        this.to = to;
        return this;
    }

}
