package com.ringcentral.definitions;


public class ValidateMultipleSwitchesRequest
{
    /**
     */
    public SwitchInfo[] records;
    public ValidateMultipleSwitchesRequest records(SwitchInfo[] records)
    {
        this.records = records;
        return this;
    }
}