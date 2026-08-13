package com.ringcentral.definitions;

/** Ring target */
public class CommCloudConnectorRingTargetResource {
    /** Required */
    public CommCloudDestination destination;

    public CommCloudConnectorRingTargetResource destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Ring target type Required Example: CloudConnectorRingTarget Enum: AllDesktopRingTarget,
     * AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget,
     * ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget, CloudConnectorRingTarget
     */
    public String type;

    public CommCloudConnectorRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public String name;

    public CommCloudConnectorRingTargetResource name(String name) {
        this.name = name;
        return this;
    }
}
