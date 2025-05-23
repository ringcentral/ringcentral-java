package com.ringcentral.definitions;


public class CommHotdeskRingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: HotdeskRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommDeviceResource device;

    public CommHotdeskRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommHotdeskRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommHotdeskRingTargetResource device(CommDeviceResource device) {
        this.device = device;
        return this;
    }
}
