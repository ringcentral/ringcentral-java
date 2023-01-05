package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByDirection
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByDirection aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByDirection aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}