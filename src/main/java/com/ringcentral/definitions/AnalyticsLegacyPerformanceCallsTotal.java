package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTotal
{
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AnalyticsLegacyPerformanceCallsTotal valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     * Format: double
     */
    public Double values;
    public AnalyticsLegacyPerformanceCallsTotal values(Double values)
    {
        this.values = values;
        return this;
    }
}