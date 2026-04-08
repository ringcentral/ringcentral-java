package com.ringcentral.definitions;


public class CommForwardingTargetResource
{
    /**
     * Ring target type
     * Required
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommForwardingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }
}