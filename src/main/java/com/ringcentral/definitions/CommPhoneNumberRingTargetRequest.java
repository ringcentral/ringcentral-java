package com.ringcentral.definitions;


public class CommPhoneNumberRingTargetRequest {
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
    /**
     *
     */
    public String name;

    public CommPhoneNumberRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommPhoneNumberRingTargetRequest destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommPhoneNumberRingTargetRequest name(String name) {
        this.name = name;
        return this;
    }
}
