package com.ringcentral.definitions;


public class CommDeviceRingTargetRequest {
    /**
     * Ring target type
     * Required
     * Example: DeviceRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommDeviceRequest device;
    /**
     *
     */
    public CommReferencedExtensionResource extension;

    public CommDeviceRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommDeviceRingTargetRequest device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    public CommDeviceRingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
