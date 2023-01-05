package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByCompanyHours
{
    /**
     * Enum: Sum, Average, Max, Min, Percent
     */
    public String aggregationType;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByCompanyHours aggregationType(String aggregationType)
    {
        this.aggregationType = aggregationType;
        return this;
    }

    /**
     * Enum: Hour, Day, Week, Month
     */
    public String aggregationInterval;
    public AnalyticsLegacyPerformanceCallsCountersResponseOptionsCallsByCompanyHours aggregationInterval(String aggregationInterval)
    {
        this.aggregationInterval = aggregationInterval;
        return this;
    }
}