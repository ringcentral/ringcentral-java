package com.ringcentral.definitions;

/** Ring target */
public class CommCloudConnectorRingTargetRequest {
    /**
     * Ring target type Required Example: CloudConnectorRingTarget Enum: AllDesktopRingTarget,
     * AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget,
     * ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget, CloudConnectorRingTarget
     */
    public String type;

    public CommCloudConnectorRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommCloudDestination destination;

    public CommCloudConnectorRingTargetRequest destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** Required Example: Cloud Connector Contact */
    public String name;

    public CommCloudConnectorRingTargetRequest name(String name) {
        this.name = name;
        return this;
    }
}
