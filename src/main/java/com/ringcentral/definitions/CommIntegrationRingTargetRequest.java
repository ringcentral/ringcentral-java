package com.ringcentral.definitions;


public class CommIntegrationRingTargetRequest {
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
    public CommIntegrationRequest integration;

    public CommIntegrationRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommIntegrationRingTargetRequest integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }
}
