package com.ringcentral.definitions;


public class CompanyAnsweringRuleCalledNumberInfo {
    /**
     * Internal identifier of an account phone number
     */
    public String id;
    /**
     * Phone number of a callee
     */
    public String phoneNumber;

    public CompanyAnsweringRuleCalledNumberInfo id(String id) {
        this.id = id;
        return this;
    }

    public CompanyAnsweringRuleCalledNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
