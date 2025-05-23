package com.ringcentral.definitions;


public class CommDeviceForwardingTargetRequest {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: DeviceRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
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

    public CommDeviceForwardingTargetRequest name(String name) {
        this.name = name;
        return this;
    }

    public CommDeviceForwardingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommDeviceForwardingTargetRequest device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    public CommDeviceForwardingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
