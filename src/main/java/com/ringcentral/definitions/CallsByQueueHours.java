package com.ringcentral.definitions;


/**
 * Data for calls with breakdown by queue hours (BusinessHours, AfterHours)
 */
public class CallsByQueueHours {
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByQueueHoursBreakdown values;

    public CallsByQueueHours valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public CallsByQueueHours values(CallsByQueueHoursBreakdown values) {
        this.values = values;
        return this;
    }
}
