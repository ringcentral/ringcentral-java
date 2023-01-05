package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByType
{
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AnalyticsLegacyPerformanceCallsByType valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyCallsByType values;
    public AnalyticsLegacyPerformanceCallsByType values(AnalyticsLegacyCallsByType values)
    {
        this.values = values;
        return this;
    }
}