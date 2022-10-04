package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByDirection {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public AnalyticsLegacyCallsByDirection values;

    public AnalyticsLegacyPerformanceCallsByDirection valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsByDirection values(AnalyticsLegacyCallsByDirection values) {
        this.values = values;
        return this;
    }
}
