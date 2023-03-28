package com.ringcentral.definitions;


public class ValidateMultipleSwitchesResponse {
    /**
     *
     */
    public SwitchValidated[] records;

    public ValidateMultipleSwitchesResponse records(SwitchValidated[] records) {
        this.records = records;
        return this;
    }
}
