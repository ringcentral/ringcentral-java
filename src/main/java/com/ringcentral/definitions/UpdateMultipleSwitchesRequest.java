package com.ringcentral.definitions;


public class UpdateMultipleSwitchesRequest {
    /**
     *
     */
    public UpdateSwitchInfo[] records;

    public UpdateMultipleSwitchesRequest records(UpdateSwitchInfo[] records) {
        this.records = records;
        return this;
    }
}
