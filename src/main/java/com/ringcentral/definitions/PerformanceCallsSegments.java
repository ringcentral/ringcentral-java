package com.ringcentral.definitions;


public class PerformanceCallsSegments {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsSegments values;

    public PerformanceCallsSegments valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsSegments values(CallsSegments values) {
        this.values = values;
        return this;
    }
}
