package com.ringcentral.definitions;


public class CommDeviceForwardingTargetRequest
{
    /**
     */
    public String name;
    public CommDeviceForwardingTargetRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: DeviceRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommDeviceForwardingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommDeviceRequest device;
    public CommDeviceForwardingTargetRequest device(CommDeviceRequest device)
    {
        this.device = device;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommDeviceForwardingTargetRequest extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }
}