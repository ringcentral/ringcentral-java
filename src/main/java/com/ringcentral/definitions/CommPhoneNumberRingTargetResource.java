package com.ringcentral.definitions;


public class CommPhoneNumberRingTargetResource
{
    /**
     */
    public String name;
    public CommPhoneNumberRingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: PhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommPhoneNumberRingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommPhoneNumberRingTargetResource destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }
}