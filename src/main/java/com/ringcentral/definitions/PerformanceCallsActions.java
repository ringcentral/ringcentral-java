package com.ringcentral.definitions;


public class PerformanceCallsActions {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsActions values;

    public PerformanceCallsActions valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsActions values(CallsActions values) {
        this.values = values;
        return this;
    }
}
