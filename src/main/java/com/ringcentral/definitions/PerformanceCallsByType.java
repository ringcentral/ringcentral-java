package com.ringcentral.definitions;


public class PerformanceCallsByType {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByType values;

    public PerformanceCallsByType valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsByType values(CallsByType values) {
        this.values = values;
        return this;
    }
}
