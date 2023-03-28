package com.ringcentral.definitions;


/**
 * Data for calls with breakdown by direction (Inbound, Outbound)
 */
public class CallsByDirection {
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByDirectionBreakdown values;

    public CallsByDirection valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public CallsByDirection values(CallsByDirectionBreakdown values) {
        this.values = values;
        return this;
    }
}
