package com.ringcentral.definitions;


/**
 * Data for calls with breakdown by action (HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer)
 */
public class CallsByActions {
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    /**
     * Required
     */
    public CallsByActionsBreakdown values;

    public CallsByActions valueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public CallsByActions values(CallsByActionsBreakdown values) {
        this.values = values;
        return this;
    }
}
