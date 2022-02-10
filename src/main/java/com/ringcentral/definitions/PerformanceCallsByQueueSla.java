package com.ringcentral.definitions;


public class PerformanceCallsByQueueSla {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByQueueSla values;

    public PerformanceCallsByQueueSla valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsByQueueSla values(CallsByQueueSla values) {
        this.values = values;
        return this;
    }
}
