package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByOrigin {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public AnalyticsLegacyCallsByOrigin values;

    public AnalyticsLegacyPerformanceCallsByOrigin valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsByOrigin values(AnalyticsLegacyCallsByOrigin values) {
        this.values = values;
        return this;
    }
}
