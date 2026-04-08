package com.ringcentral.definitions;

public class AssignNumbersRequest {
    /** List of phone numbers to assign */
    public String[] phoneNumbers;

    public AssignNumbersRequest phoneNumbers(String[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
}
