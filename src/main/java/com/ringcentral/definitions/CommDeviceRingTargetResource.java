package com.ringcentral.definitions;


public class CommDeviceRingTargetResource {
    /**
     * Required
     */
    public String name;
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
    public CommDeviceResource device;
    /**
     *
     */
    public CommReferencedExtensionResource extension;

    public CommDeviceRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommDeviceRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommDeviceRingTargetResource device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    public CommDeviceRingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
