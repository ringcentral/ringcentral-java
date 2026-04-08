package com.ringcentral.definitions;


public class CommIntegrationRingTargetResource
{
    /**
     * Required
     */
    public String name;
    public CommIntegrationRingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: IntegrationRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommIntegrationRingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommIntegrationResource integration;
    public CommIntegrationRingTargetResource integration(CommIntegrationResource integration)
    {
        this.integration = integration;
        return this;
    }
}