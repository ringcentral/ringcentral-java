package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByOrigin aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}