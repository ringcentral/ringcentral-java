package com.ringcentral.definitions;


public class CommDeviceForwardingTargetResource {
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
    public CommDeviceResource device;
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;

    public CommDeviceForwardingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommDeviceForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommDeviceForwardingTargetResource device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    public CommDeviceForwardingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
