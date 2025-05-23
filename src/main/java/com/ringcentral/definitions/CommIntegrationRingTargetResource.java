package com.ringcentral.definitions;


public class CommIntegrationRingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: IntegrationRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommIntegrationResource integration;

    public CommIntegrationRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommIntegrationRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommIntegrationRingTargetResource integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }
}
