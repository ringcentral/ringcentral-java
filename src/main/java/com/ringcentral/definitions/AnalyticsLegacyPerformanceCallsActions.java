package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsActions {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public AnalyticsLegacyCallsActions values;

    public AnalyticsLegacyPerformanceCallsActions valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsActions values(AnalyticsLegacyCallsActions values) {
        this.values = values;
        return this;
    }
}
