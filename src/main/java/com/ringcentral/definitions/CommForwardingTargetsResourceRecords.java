package com.ringcentral.definitions;

public class CommForwardingTargetsResourceRecords {
    /**
     * Ring target type Example: PhoneNumberRingTarget Enum: CoworkerAppsRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget,
     * IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommForwardingTargetsResourceRecords type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommForwardingTargetsResourceRecords extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommDeviceResource device;

    public CommForwardingTargetsResourceRecords device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    /** Device name Example: HP2 */
    public String name;

    public CommForwardingTargetsResourceRecords name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public CommPhoneNumberResource destination;

    public CommForwardingTargetsResourceRecords destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    /** */
    public CommIntegrationResource integration;

    public CommForwardingTargetsResourceRecords integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }
}
