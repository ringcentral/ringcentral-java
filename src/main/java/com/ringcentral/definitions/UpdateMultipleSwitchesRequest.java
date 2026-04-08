package com.ringcentral.definitions;


public class UpdateMultipleSwitchesRequest
{
    /**
     */
    public SwitchInfo[] records;
    public UpdateMultipleSwitchesRequest records(SwitchInfo[] records)
    {
        this.records = records;
        return this;
    }
}