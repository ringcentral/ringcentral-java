package com.ringcentral.definitions;


public class PerformanceCallsByDirection {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByDirection values;

    public PerformanceCallsByDirection valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsByDirection values(CallsByDirection values) {
        this.values = values;
        return this;
    }
}
