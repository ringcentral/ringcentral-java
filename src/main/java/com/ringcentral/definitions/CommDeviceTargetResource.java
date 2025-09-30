package com.ringcentral.definitions;


public class CommDeviceTargetResource {
    /**
     * Required
     */
    public CommDeviceResource device;
    /**
     *
     */
    public CommReferencedExtensionResource extension;
    /**
     * Ring target type
     * Example: DeviceRingTarget
     * Enum: DeviceRingTarget
     */
    public String type;

    public CommDeviceTargetResource device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    public CommDeviceTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommDeviceTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
