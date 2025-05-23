package com.ringcentral.definitions;


public class CommIntegrationForwardingTargetRequest {
    /**
     *
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
    public CommIntegrationRequest integration;

    public CommIntegrationForwardingTargetRequest name(String name) {
        this.name = name;
        return this;
    }

    public CommIntegrationForwardingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommIntegrationForwardingTargetRequest integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }
}
