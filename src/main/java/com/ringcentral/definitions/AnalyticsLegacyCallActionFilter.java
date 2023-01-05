package com.ringcentral.definitions;


public class AnalyticsLegacyCallActionFilter
{
    /**
     * Required
     * Enum: HoldOff, HoldOn, ParkOn, ParkOff, BlindTransfer, WarmTransfer, DTMFTransfer
     */
    public String callAction;
    public AnalyticsLegacyCallActionFilter callAction(String callAction)
    {
        this.callAction = callAction;
        return this;
    }
}