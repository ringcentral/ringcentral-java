package com.ringcentral.definitions;


/**
 * Data for calls with breakdown by response (Answered, NotAnswered, Connected, NotConnected)
 */
public class CallsByResponse {
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByResponseBreakdown values;

    public CallsByResponse valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public CallsByResponse values(CallsByResponseBreakdown values) {
        this.values = values;
        return this;
    }
}
