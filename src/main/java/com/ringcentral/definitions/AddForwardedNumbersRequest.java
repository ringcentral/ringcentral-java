package com.ringcentral.definitions;


public class AddForwardedNumbersRequest {
    /**
     * Required
     */
    public AddForwardedNumberRequestItem[] records;

    public AddForwardedNumbersRequest records(AddForwardedNumberRequestItem[] records) {
        this.records = records;
        return this;
    }
}
