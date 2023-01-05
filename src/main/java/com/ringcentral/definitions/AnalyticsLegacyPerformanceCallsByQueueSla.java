package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByQueueSla
{
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AnalyticsLegacyPerformanceCallsByQueueSla valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyCallsByQueueSla values;
    public AnalyticsLegacyPerformanceCallsByQueueSla values(AnalyticsLegacyCallsByQueueSla values)
    {
        this.values = values;
        return this;
    }
}