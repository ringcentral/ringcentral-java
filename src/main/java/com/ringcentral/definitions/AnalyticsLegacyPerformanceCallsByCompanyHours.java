package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByCompanyHours {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public AnalyticsLegacyCallsByCompanyHours values;

    public AnalyticsLegacyPerformanceCallsByCompanyHours valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public AnalyticsLegacyPerformanceCallsByCompanyHours values(AnalyticsLegacyCallsByCompanyHours values) {
        this.values = values;
        return this;
    }
}
