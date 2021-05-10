package com.ringcentral.definitions;


public class UpdateMultipleWirelessPointsRequest {
    /**
     *
     */
    public UpdateWirelessPoint[] records;

    public UpdateMultipleWirelessPointsRequest records(UpdateWirelessPoint[] records) {
        this.records = records;
        return this;
    }
}
