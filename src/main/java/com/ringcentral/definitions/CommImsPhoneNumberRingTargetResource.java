package com.ringcentral.definitions;


public class CommImsPhoneNumberRingTargetResource {
    /**
     *
     */
    public String name;
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

    public CommImsPhoneNumberRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommImsPhoneNumberRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommImsPhoneNumberRingTargetResource destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
