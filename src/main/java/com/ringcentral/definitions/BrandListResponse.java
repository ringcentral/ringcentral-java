package com.ringcentral.definitions;


public class BrandListResponse
{
    /**
     * Required
     */
    public TcrBrandRecord[] records;
    public BrandListResponse records(TcrBrandRecord[] records)
    {
        this.records = records;
        return this;
    }
}