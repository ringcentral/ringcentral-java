package com.ringcentral.definitions;

public class CommIntegrationForwardingTargetResource {
    /**
     * Ring target type Required Example: IntegrationRingTarget Enum: CoworkerAppsRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget,
     * IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommIntegrationForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommIntegrationResource integration;

    public CommIntegrationForwardingTargetResource integration(
            CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }
}
