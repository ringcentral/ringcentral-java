package com.ringcentral.definitions;


public class CommImsPhoneNumberForwardingTargetResource
{
    /**
     * Ring target type
     * Required
     * Example: ImsPhoneNumberRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommImsPhoneNumberForwardingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommImsPhoneNumberForwardingTargetResource destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }
}