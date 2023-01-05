package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByDirection
{
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AnalyticsLegacyPerformanceCallsByDirection valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyCallsByDirection values;
    public AnalyticsLegacyPerformanceCallsByDirection values(AnalyticsLegacyCallsByDirection values)
    {
        this.values = values;
        return this;
    }
}