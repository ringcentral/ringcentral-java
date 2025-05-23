package com.ringcentral.definitions;


public class CommRemoveForwardingTargetsItemResourceBulkItem {
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

    public CommRemoveForwardingTargetsItemResourceBulkItem name(String name) {
        this.name = name;
        return this;
    }

    public CommRemoveForwardingTargetsItemResourceBulkItem type(String type) {
        this.type = type;
        return this;
    }

    public CommRemoveForwardingTargetsItemResourceBulkItem extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommRemoveForwardingTargetsItemResourceBulkItem device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    public CommRemoveForwardingTargetsItemResourceBulkItem integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    public CommRemoveForwardingTargetsItemResourceBulkItem destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
