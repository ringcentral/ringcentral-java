package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTimeInterval
{
    /**
     * Time in format hh:mm
     * Required
     */
    public String from;
    public AnalyticsLegacyPerformanceCallsTimeInterval from(String from)
    {
        this.from = from;
        return this;
    }

    /**
     * Time in format hh:mm
     * Required
     */
    public String to;
    public AnalyticsLegacyPerformanceCallsTimeInterval to(String to)
    {
        this.to = to;
        return this;
    }
}