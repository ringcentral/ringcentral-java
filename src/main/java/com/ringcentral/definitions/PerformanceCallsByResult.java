package com.ringcentral.definitions;


public class PerformanceCallsByResult {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByResult values;

    public PerformanceCallsByResult valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsByResult values(CallsByResult values) {
        this.values = values;
        return this;
    }
}
