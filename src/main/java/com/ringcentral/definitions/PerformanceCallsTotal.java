package com.ringcentral.definitions;


public class PerformanceCallsTotal {
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

    public PerformanceCallsTotal valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsTotal values(Double values) {
        this.values = values;
        return this;
    }
}
