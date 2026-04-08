package com.ringcentral.definitions;


public class CreateMultipleSwitchesRequest
{
    /**
     */
    public SwitchInfo[] records;
    public CreateMultipleSwitchesRequest records(SwitchInfo[] records)
    {
        this.records = records;
        return this;
    }
}