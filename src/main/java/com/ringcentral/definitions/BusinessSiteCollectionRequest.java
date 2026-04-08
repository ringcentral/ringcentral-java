package com.ringcentral.definitions;


public class BusinessSiteCollectionRequest
{
    /**
     */
    public RolesBusinessSiteResource[] records;
    public BusinessSiteCollectionRequest records(RolesBusinessSiteResource[] records)
    {
        this.records = records;
        return this;
    }
}