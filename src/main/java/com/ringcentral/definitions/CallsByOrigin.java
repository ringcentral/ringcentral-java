package com.ringcentral.definitions;


/**
 * Data for calls with breakdown by origin (Internal, External)
 */
public class CallsByOrigin {
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByOriginBreakdown values;

    public CallsByOrigin valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public CallsByOrigin values(CallsByOriginBreakdown values) {
        this.values = values;
        return this;
    }
}
