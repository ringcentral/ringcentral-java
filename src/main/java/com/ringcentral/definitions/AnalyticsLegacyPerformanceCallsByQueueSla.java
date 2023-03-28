package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByQueueSla {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public AnalyticsLegacyCallsByQueueSla values;

    public AnalyticsLegacyPerformanceCallsByQueueSla valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsByQueueSla values(AnalyticsLegacyCallsByQueueSla values) {
        this.values = values;
        return this;
    }
}
