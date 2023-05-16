package com.ringcentral.definitions;


public class AddPhoneNumbersResponse {
    /**
     * List of account phone numbers
     * Required
     */
    public AddPhoneNumbersResponseItem[] records;

    public AddPhoneNumbersResponse records(AddPhoneNumbersResponseItem[] records) {
        this.records = records;
        return this;
    }
}
