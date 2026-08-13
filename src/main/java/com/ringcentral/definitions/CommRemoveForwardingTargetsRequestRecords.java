package com.ringcentral.definitions;

public class CommRemoveForwardingTargetsRequestRecords {
    /** Example: Cloud Connector Contact */
    public String name;

    public CommRemoveForwardingTargetsRequestRecords name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Ring target type Example: CloudConnectorRingTarget Enum: AllDesktopRingTarget,
     * AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget,
     * ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget, CloudConnectorRingTarget
     */
    public String type;

    public CommRemoveForwardingTargetsRequestRecords type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommRemoveForwardingTargetsRequestRecords extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommDeviceRequest device;

    public CommRemoveForwardingTargetsRequestRecords device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    /** */
    public CommIntegrationRequest integration;

    public CommRemoveForwardingTargetsRequestRecords integration(
            CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    /** */
    public CommCloudDestination destination;

    public CommRemoveForwardingTargetsRequestRecords destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }
}
