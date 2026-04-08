package com.ringcentral.definitions;


public class CommIntegrationTargetRequest
{
    /**
     * Required
     */
    public CommIntegrationRequest integration;
    public CommIntegrationTargetRequest integration(CommIntegrationRequest integration)
    {
        this.integration = integration;
        return this;
    }

    /**
     * Ring target type
     * Example: IntegrationRingTarget
     * Enum: IntegrationRingTarget
     */
    public String type;
    public CommIntegrationTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }
}