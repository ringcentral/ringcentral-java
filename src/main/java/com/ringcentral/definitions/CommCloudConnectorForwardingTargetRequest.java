package com.ringcentral.definitions;

/** Ring target */
public class CommCloudConnectorForwardingTargetRequest {
    /** Required */
    public CommCloudDestination destination;

    public CommCloudConnectorForwardingTargetRequest destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Ring target type Required Example: CloudConnectorRingTarget Enum: CoworkerAppsRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget, CloudConnectorRingTarget
     */
    public String type;

    public CommCloudConnectorForwardingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public String name;

    public CommCloudConnectorForwardingTargetRequest name(String name) {
        this.name = name;
        return this;
    }
}
