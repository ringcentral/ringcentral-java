package com.ringcentral.definitions;


public class DeletePhoneNumbersResponse {
    /**
     * Required
     */
    public DeletePhoneNumbersResponseItem[] records;

    public DeletePhoneNumbersResponse records(DeletePhoneNumbersResponseItem[] records) {
        this.records = records;
        return this;
    }
}
