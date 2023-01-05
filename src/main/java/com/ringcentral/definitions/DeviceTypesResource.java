package com.ringcentral.definitions;


public class DeviceTypesResource
{
    /**
     */
    public DeviceTypeIdResource[] records;
    public DeviceTypesResource records(DeviceTypeIdResource[] records)
    {
        this.records = records;
        return this;
    }
}