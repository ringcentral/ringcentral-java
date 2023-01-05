package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsSegmentsDuration
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsSegmentsDuration aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsSegmentsDuration aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}