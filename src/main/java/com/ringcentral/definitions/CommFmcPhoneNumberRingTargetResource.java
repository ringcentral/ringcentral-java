package com.ringcentral.definitions;


public class CommFmcPhoneNumberRingTargetResource
{
    /**
     */
    public String name;
    public CommFmcPhoneNumberRingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: FmcPhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommFmcPhoneNumberRingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommFmcPhoneNumberRingTargetResource destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }
}