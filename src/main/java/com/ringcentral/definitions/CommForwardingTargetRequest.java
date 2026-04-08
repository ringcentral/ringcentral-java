package com.ringcentral.definitions;


public class CommForwardingTargetRequest
{
    /**
     */
    public String name;
    public CommForwardingTargetRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommForwardingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }
}