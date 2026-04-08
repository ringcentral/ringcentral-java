package com.ringcentral.definitions;


public class CommFmcPhoneNumberRingTargetRequest
{
    /**
     * Ring target type
     * Required
     * Example: FmcPhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommFmcPhoneNumberRingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommFmcPhoneNumberRingTargetRequest destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }
}