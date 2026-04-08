package com.ringcentral.definitions;


public class CommImsPhoneNumberRingTargetRequest
{
    /**
     * Ring target type
     * Required
     * Example: ImsPhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommImsPhoneNumberRingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommImsPhoneNumberRingTargetRequest destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }
}