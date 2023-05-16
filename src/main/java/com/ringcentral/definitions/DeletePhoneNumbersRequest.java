package com.ringcentral.definitions;


public class DeletePhoneNumbersRequest {
    /**
     * List of phone numbers or phone ids to be deleted
     * Required
     */
    public DeletePhoneNumbersRequestItem[] records;

    public DeletePhoneNumbersRequest records(DeletePhoneNumbersRequestItem[] records) {
        this.records = records;
        return this;
    }
}
