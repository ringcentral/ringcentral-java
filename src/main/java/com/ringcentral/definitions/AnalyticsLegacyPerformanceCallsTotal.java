package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsTotal {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     * Format: double
     */
    public Double values;

    public AnalyticsLegacyPerformanceCallsTotal valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsTotal values(Double values) {
        this.values = values;
        return this;
    }
}
