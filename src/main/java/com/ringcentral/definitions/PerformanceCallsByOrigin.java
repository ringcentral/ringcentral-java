package com.ringcentral.definitions;


public class PerformanceCallsByOrigin {
    /**
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByOrigin values;

    public PerformanceCallsByOrigin valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public PerformanceCallsByOrigin values(CallsByOrigin values) {
        this.values = values;
        return this;
    }
}
