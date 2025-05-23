package com.ringcentral.definitions;


public class CommIntegrationTargetRequest {
    /**
     * Required
     */
    public CommIntegrationRequest integration;
    /**
     * Ring target type
     * Example: IntegrationRingTarget
     * Enum: IntegrationRingTarget
     */
    public String type;

    public CommIntegrationTargetRequest integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    public CommIntegrationTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
