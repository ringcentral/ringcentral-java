package com.ringcentral.definitions;


public class AddForwardedNumbersResponse {
    /**
     * Required
     */
    public AddForwardedNumberResponseItem[] records;

    public AddForwardedNumbersResponse records(AddForwardedNumberResponseItem[] records) {
        this.records = records;
        return this;
    }
}
