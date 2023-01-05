package com.ringcentral.definitions;


public class CompanyAnsweringRuleCallersInfoRequest
{
    /**
     * Phone number of a caller
     */
    public String callerId;
    public CompanyAnsweringRuleCallersInfoRequest callerId(String callerId)
    {
        this.callerId = callerId;
        return this;
    }

    /**
     * Displayed name for a caller ID
     */
    public String name;
    public CompanyAnsweringRuleCallersInfoRequest name(String name)
    {
        this.name = name;
        return this;
    }
}