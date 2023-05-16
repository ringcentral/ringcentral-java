package com.ringcentral.definitions;


public class AddPhoneNumbersRequest {
    /**
     * List of account phone numbers
     * Required
     */
    public AddPhoneNumberRequestItem[] records;

    public AddPhoneNumbersRequest records(AddPhoneNumberRequestItem[] records) {
        this.records = records;
        return this;
    }
}
