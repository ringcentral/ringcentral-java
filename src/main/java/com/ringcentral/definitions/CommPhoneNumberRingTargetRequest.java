package com.ringcentral.definitions;


public class CommPhoneNumberRingTargetRequest
{
    /**
     * Ring target type
     * Required
     * Example: PhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommPhoneNumberRingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommPhoneNumberRingTargetRequest destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }

    /**
     */
    public String name;
    public CommPhoneNumberRingTargetRequest name(String name)
    {
        this.name = name;
        return this;
    }
}