package com.ringcentral.definitions;


public class CommRingTargetRequest {
    /**
     * Ring target type
     * Required
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
