package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsSegments {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public AnalyticsLegacyCallsSegments values;

    public AnalyticsLegacyPerformanceCallsSegments valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsSegments values(AnalyticsLegacyCallsSegments values) {
        this.values = values;
        return this;
    }
}
