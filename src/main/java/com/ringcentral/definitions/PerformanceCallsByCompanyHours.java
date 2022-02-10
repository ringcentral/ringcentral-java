package com.ringcentral.definitions;


public class PerformanceCallsByCompanyHours {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByCompanyHours values;

    public PerformanceCallsByCompanyHours valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsByCompanyHours values(CallsByCompanyHours values) {
        this.values = values;
        return this;
    }
}
