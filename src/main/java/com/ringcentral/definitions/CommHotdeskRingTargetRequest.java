package com.ringcentral.definitions;


public class CommHotdeskRingTargetRequest {
    /**
     * Ring target type
     * Required
     * Example: HotdeskRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommHotdeskRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
