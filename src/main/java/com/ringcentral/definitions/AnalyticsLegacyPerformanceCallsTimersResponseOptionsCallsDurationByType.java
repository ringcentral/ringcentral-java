package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByType
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByType aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByType aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}