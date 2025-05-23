package com.ringcentral.definitions;


public class CommRingTargetResource {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommRingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
