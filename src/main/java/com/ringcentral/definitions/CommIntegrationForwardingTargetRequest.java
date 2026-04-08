package com.ringcentral.definitions;


public class CommIntegrationForwardingTargetRequest
{
    /**
     */
    public String name;
    public CommIntegrationForwardingTargetRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Required
     * Example: IntegrationRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommIntegrationForwardingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommIntegrationRequest integration;
    public CommIntegrationForwardingTargetRequest integration(CommIntegrationRequest integration)
    {
        this.integration = integration;
        return this;
    }
}