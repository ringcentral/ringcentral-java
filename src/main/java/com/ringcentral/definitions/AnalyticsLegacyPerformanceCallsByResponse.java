package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByResponse {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public AnalyticsLegacyCallsByResponse values;

    public AnalyticsLegacyPerformanceCallsByResponse valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsByResponse values(AnalyticsLegacyCallsByResponse values) {
        this.values = values;
        return this;
    }
}
