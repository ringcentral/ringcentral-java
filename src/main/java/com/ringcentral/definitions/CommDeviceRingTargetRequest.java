package com.ringcentral.definitions;

public class CommDeviceRingTargetRequest {
    /**
     * Ring target type Required Example: DeviceRingTarget Enum: AllDesktopRingTarget,
     * AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget,
     * ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget
     */
    public String type;

    public CommDeviceRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommDeviceRequest device;

    public CommDeviceRingTargetRequest device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommDeviceRingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
