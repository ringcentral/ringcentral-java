package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByType {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public AnalyticsLegacyCallsByType values;

    public AnalyticsLegacyPerformanceCallsByType valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsByType values(AnalyticsLegacyCallsByType values) {
        this.values = values;
        return this;
    }
}
