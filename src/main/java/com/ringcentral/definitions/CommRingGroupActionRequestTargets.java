package com.ringcentral.definitions;

public class CommRingGroupActionRequestTargets {
    /**
     * Ring target type Example: CloudConnectorRingTarget Enum: AllDesktopRingTarget,
     * AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget,
     * ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget, CloudConnectorRingTarget
     */
    public String type;

    public CommRingGroupActionRequestTargets type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommRingGroupActionRequestTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommDeviceRequest device;

    public CommRingGroupActionRequestTargets device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    /** */
    public CommCloudDestination destination;

    public CommRingGroupActionRequestTargets destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** */
    public CommIntegrationRequest integration;

    public CommRingGroupActionRequestTargets integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    /** Example: Cloud Connector Contact */
    public String name;

    public CommRingGroupActionRequestTargets name(String name) {
        this.name = name;
        return this;
    }
}
