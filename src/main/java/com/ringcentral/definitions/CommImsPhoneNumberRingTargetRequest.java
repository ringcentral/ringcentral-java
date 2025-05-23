package com.ringcentral.definitions;


public class CommImsPhoneNumberRingTargetRequest {
    /**
     * Ring target type
     * Required
     * Example: ImsPhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommPhoneNumberResource destination;

    public CommImsPhoneNumberRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommImsPhoneNumberRingTargetRequest destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
