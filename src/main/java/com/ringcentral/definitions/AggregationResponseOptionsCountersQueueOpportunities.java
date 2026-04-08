package com.ringcentral.definitions;


public class AggregationResponseOptionsCountersQueueOpportunities
{
    /**
     * Counter aggregation type for queue opportunities, limited to `Sum` only.
     * Enum: Sum
     */
    public String aggregationType;
    public AggregationResponseOptionsCountersQueueOpportunities aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }
}