package com.ringcentral.definitions;


public class PerformanceCallsByResponse {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByResponse values;

    public PerformanceCallsByResponse valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsByResponse values(CallsByResponse values) {
        this.values = values;
        return this;
    }
}
