package com.ringcentral.definitions;

/** Ring target */
public class CommCloudConnectorForwardingTargetResource {
    /** Required */
    public CommCloudDestination destination;

    public CommCloudConnectorForwardingTargetResource destination(
            CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Ring target type Required Example: CloudConnectorRingTarget Enum: CoworkerAppsRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget,
     * IntegrationRingTarget, PhoneNumberRingTarget, CloudConnectorRingTarget
     */
    public String type;

    public CommCloudConnectorForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
