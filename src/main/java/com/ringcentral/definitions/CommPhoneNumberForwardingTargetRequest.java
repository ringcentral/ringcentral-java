package com.ringcentral.definitions;


public class CommPhoneNumberForwardingTargetRequest
{
    /**
     */
    public String name;
    public CommPhoneNumberForwardingTargetRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: PhoneNumberRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommPhoneNumberForwardingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommPhoneNumberForwardingTargetRequest destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }
}