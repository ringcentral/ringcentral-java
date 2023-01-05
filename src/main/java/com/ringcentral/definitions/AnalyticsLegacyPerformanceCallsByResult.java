package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByResult
{
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AnalyticsLegacyPerformanceCallsByResult valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyCallsByResult values;
    public AnalyticsLegacyPerformanceCallsByResult values(AnalyticsLegacyCallsByResult values)
    {
        this.values = values;
        return this;
    }
}