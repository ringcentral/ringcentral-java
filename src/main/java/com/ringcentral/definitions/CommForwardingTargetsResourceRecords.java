package com.ringcentral.definitions;


public class CommForwardingTargetsResourceRecords {
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
    public CommDeviceResource device;
    /**
     *
     */
    public CommPhoneNumberResource destination;
    /**
     *
     */
    public CommIntegrationResource integration;

    public CommForwardingTargetsResourceRecords name(String name) {
        this.name = name;
        return this;
    }

    public CommForwardingTargetsResourceRecords type(String type) {
        this.type = type;
        return this;
    }

    public CommForwardingTargetsResourceRecords extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommForwardingTargetsResourceRecords device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    public CommForwardingTargetsResourceRecords destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommForwardingTargetsResourceRecords integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }
}
