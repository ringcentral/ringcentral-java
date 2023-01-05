package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByQueueSla
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByQueueSla aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByQueueSla aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}