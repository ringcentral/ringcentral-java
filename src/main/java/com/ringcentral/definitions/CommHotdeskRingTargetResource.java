package com.ringcentral.definitions;


public class CommHotdeskRingTargetResource
{
    /**
     * Required
     */
    public String name;
    public CommHotdeskRingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: HotdeskRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommHotdeskRingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommDeviceResource device;
    public CommHotdeskRingTargetResource device(CommDeviceResource device)
    {
        this.device = device;
        return this;
    }
}