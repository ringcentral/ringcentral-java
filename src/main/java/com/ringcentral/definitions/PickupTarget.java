package com.ringcentral.definitions;


public class PickupTarget
{
    /**
     * Device identifier that is used to pick up the parked call.
     * Required
     * Example: 400018633008
     */
    public String deviceId;
    public PickupTarget deviceId(String deviceId)
    {
        this.deviceId = deviceId;
        return this;
    }
}