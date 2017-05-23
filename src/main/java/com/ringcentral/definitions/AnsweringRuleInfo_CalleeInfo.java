package com.ringcentral.definitions;

public class AnsweringRuleInfo_CalleeInfo {
    // Called phone number
    public String phoneNumber;

    public AnsweringRuleInfo_CalleeInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
