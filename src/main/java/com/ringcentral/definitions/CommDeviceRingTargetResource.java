package com.ringcentral.definitions;


public class CommDeviceRingTargetResource
{
    /**
     * Required
     */
    public String name;
    public CommDeviceRingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: DeviceRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommDeviceRingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommDeviceResource device;
    public CommDeviceRingTargetResource device(CommDeviceResource device)
    {
        this.device = device;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommDeviceRingTargetResource extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }
}