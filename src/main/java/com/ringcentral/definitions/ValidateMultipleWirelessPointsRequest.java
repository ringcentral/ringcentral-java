package com.ringcentral.definitions;


public class ValidateMultipleWirelessPointsRequest
{
    /**
     */
    public WirelessPointInfo[] records;
    public ValidateMultipleWirelessPointsRequest records(WirelessPointInfo[] records)
    {
        this.records = records;
        return this;
    }
}