package com.ringcentral.definitions;


public class ValidateMultipleWirelessPointsResponse {
    /**
     *
     */
    public WirelessPointValidated[] records;

    public ValidateMultipleWirelessPointsResponse records(WirelessPointValidated[] records) {
        this.records = records;
        return this;
    }
}
