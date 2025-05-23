package com.ringcentral.definitions;


public class CommPhoneNumberRingTargetResource {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: PhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommPhoneNumberResource destination;

    public CommPhoneNumberRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommPhoneNumberRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommPhoneNumberRingTargetResource destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
