package com.ringcentral.definitions;


public class CommDeviceTargetRequest {
    /**
     * Required
     */
    public CommDeviceRequest device;
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

    public CommDeviceTargetRequest device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    public CommDeviceTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommDeviceTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
