package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResponse
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResponse aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsTimersResponseOptionsCallsDurationByResponse aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}