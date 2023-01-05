package com.ringcentral.definitions;


public class EmergencyLocationsResource
{
    /**
     */
    public EmergencyLocationResource[] records;
    public EmergencyLocationsResource records(EmergencyLocationResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public EmergencyLocationsPaging paging;
    public EmergencyLocationsResource paging(EmergencyLocationsPaging paging)
    {
        this.paging = paging;
        return this;
    }
}