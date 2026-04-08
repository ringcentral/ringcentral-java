package com.ringcentral.definitions;

public class CommIntegrationTargetResource {
    /** Required */
    public CommIntegrationResource integration;

    public CommIntegrationTargetResource integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }

    /** Ring target type Example: IntegrationRingTarget Enum: IntegrationRingTarget */
    public String type;

    public CommIntegrationTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
