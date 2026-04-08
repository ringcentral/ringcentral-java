package com.ringcentral.definitions;


public class CampaignListResponse
{
    /**
     * Required
     */
    public TcrCampaignRecord[] records;
    public CampaignListResponse records(TcrCampaignRecord[] records)
    {
        this.records = records;
        return this;
    }
}