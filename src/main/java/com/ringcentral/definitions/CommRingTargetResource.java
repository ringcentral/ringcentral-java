package com.ringcentral.definitions;

public class CommRingTargetResource {
    /** */
    public String name;

    public CommRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Ring target type Required Enum: AllDesktopRingTarget, AllMobileRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget,
     * FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommRingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
