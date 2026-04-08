package com.ringcentral.definitions;


public class CommRingGroupActionResourceTargets
{
    /**
     */
    public String name;
    public CommRingGroupActionResourceTargets name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Example: PhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommRingGroupActionResourceTargets type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommRingGroupActionResourceTargets extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     */
    public CommDeviceResource device;
    public CommRingGroupActionResourceTargets device(CommDeviceResource device)
    {
        this.device = device;
        return this;
    }

    /**
     */
    public CommPhoneNumberResource destination;
    public CommRingGroupActionResourceTargets destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }

    /**
     */
    public CommIntegrationResource integration;
    public CommRingGroupActionResourceTargets integration(CommIntegrationResource integration)
    {
        this.integration = integration;
        return this;
    }
}