package com.ringcentral.definitions;


public class CommRemoveForwardingTargetsItemResourceBulkItem
{
    /**
     */
    public String name;
    public CommRemoveForwardingTargetsItemResourceBulkItem name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Ring target type
     * Example: PhoneNumberRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    public CommRemoveForwardingTargetsItemResourceBulkItem type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommRemoveForwardingTargetsItemResourceBulkItem extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     */
    public CommDeviceRequest device;
    public CommRemoveForwardingTargetsItemResourceBulkItem device(CommDeviceRequest device)
    {
        this.device = device;
        return this;
    }

    /**
     */
    public CommIntegrationRequest integration;
    public CommRemoveForwardingTargetsItemResourceBulkItem integration(CommIntegrationRequest integration)
    {
        this.integration = integration;
        return this;
    }

    /**
     */
    public CommPhoneNumberResource destination;
    public CommRemoveForwardingTargetsItemResourceBulkItem destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }
}