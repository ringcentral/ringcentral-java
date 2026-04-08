package com.ringcentral.definitions;


public class CommIntegrationRingTargetRequest
{
    /**
     * Ring target type
     * Required
     * Example: IntegrationRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommIntegrationRingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommIntegrationRequest integration;
    public CommIntegrationRingTargetRequest integration(CommIntegrationRequest integration)
    {
        this.integration = integration;
        return this;
    }
}