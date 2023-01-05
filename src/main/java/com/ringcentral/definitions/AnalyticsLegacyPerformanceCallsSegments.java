package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsSegments
{
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AnalyticsLegacyPerformanceCallsSegments valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyCallsSegments values;
    public AnalyticsLegacyPerformanceCallsSegments values(AnalyticsLegacyCallsSegments values)
    {
        this.values = values;
        return this;
    }
}