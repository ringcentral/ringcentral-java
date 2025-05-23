package com.ringcentral.definitions;


public class CommRemoveForwardingTargetsRequestRecords {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Example: PhoneNumberRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     *
     */
    public CommReferencedExtensionResource extension;
    /**
     *
     */
    public CommDeviceRequest device;
    /**
     *
     */
    public CommIntegrationRequest integration;
    /**
     *
     */
    public CommPhoneNumberResource destination;

    public CommRemoveForwardingTargetsRequestRecords name(String name) {
        this.name = name;
        return this;
    }

    public CommRemoveForwardingTargetsRequestRecords type(String type) {
        this.type = type;
        return this;
    }

    public CommRemoveForwardingTargetsRequestRecords extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommRemoveForwardingTargetsRequestRecords device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    public CommRemoveForwardingTargetsRequestRecords integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    public CommRemoveForwardingTargetsRequestRecords destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
