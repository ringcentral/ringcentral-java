package com.ringcentral.definitions;


public class CallActionFilter {
    /**
     * Enum: HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer
     */
    public String callAction;

    public CallActionFilter callAction(String callAction) {
        this.callAction = callAction;
        return this;
    }
}
