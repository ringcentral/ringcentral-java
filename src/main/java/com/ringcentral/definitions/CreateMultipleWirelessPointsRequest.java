package com.ringcentral.definitions;


public class CreateMultipleWirelessPointsRequest {
    /**
     *
     */
    public CreateWirelessPoint[] records;

    public CreateMultipleWirelessPointsRequest records(CreateWirelessPoint[] records) {
        this.records = records;
        return this;
    }
}
