package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByDirection
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByDirection aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByDirection aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}