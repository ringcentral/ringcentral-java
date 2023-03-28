package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResponse
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResponse aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByResponse aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}