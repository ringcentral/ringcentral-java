package com.ringcentral.definitions;


public class CommIntegrationForwardingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: IntegrationRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommIntegrationResource integration;

    public CommIntegrationForwardingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommIntegrationForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommIntegrationForwardingTargetResource integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }
}
