package com.ringcentral.definitions;

public class CommRemoveForwardingTargetsItemResourceBulkItem {
    /** Example: Cloud Connector Contact */
    public String name;

    public CommRemoveForwardingTargetsItemResourceBulkItem name(String name) {
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

    public CommRemoveForwardingTargetsItemResourceBulkItem type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommRemoveForwardingTargetsItemResourceBulkItem extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommDeviceRequest device;

    public CommRemoveForwardingTargetsItemResourceBulkItem device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    /** */
    public CommIntegrationRequest integration;

    public CommRemoveForwardingTargetsItemResourceBulkItem integration(
            CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    /** */
    public CommCloudDestination destination;

    public CommRemoveForwardingTargetsItemResourceBulkItem destination(
            CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }
}
