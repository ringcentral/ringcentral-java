package com.ringcentral.definitions;


public class CallPerformanceActionInfo {
    /**
     * Enum: HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer
     */
    public String callAction;

    public CallPerformanceActionInfo callAction(String callAction) {
        this.callAction = callAction;
        return this;
    }
}
