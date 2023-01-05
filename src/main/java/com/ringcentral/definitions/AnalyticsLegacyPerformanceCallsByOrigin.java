package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByOrigin
{
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AnalyticsLegacyPerformanceCallsByOrigin valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyCallsByOrigin values;
    public AnalyticsLegacyPerformanceCallsByOrigin values(AnalyticsLegacyCallsByOrigin values)
    {
        this.values = values;
        return this;
    }
}