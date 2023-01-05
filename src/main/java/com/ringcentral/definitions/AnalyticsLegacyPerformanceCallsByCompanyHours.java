package com.ringcentral.definitions;


public class AnalyticsLegacyPerformanceCallsByCompanyHours
{
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public AnalyticsLegacyPerformanceCallsByCompanyHours valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Required
     */
    public AnalyticsLegacyCallsByCompanyHours values;
    public AnalyticsLegacyPerformanceCallsByCompanyHours values(AnalyticsLegacyCallsByCompanyHours values)
    {
        this.values = values;
        return this;
    }
}