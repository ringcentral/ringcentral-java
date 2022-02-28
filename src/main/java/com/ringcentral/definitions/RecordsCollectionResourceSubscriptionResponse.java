package com.ringcentral.definitions;


public class RecordsCollectionResourceSubscriptionResponse
{
    /**
     * Format: uri
     */
    public String uri;
    public RecordsCollectionResourceSubscriptionResponse uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public SubscriptionInfo[] records;
    public RecordsCollectionResourceSubscriptionResponse records(SubscriptionInfo[] records)
    {
        this.records = records;
        return this;
    }
}