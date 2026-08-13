package com.ringcentral.definitions;

public class CommRingGroupActionResourceTargets {
    /** */
    public String name;

    public CommRingGroupActionResourceTargets name(String name) {
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

    public CommRingGroupActionResourceTargets type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommRingGroupActionResourceTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommDeviceResource device;

    public CommRingGroupActionResourceTargets device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    /** */
    public CommCloudDestination destination;

    public CommRingGroupActionResourceTargets destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** */
    public CommIntegrationResource integration;

    public CommRingGroupActionResourceTargets integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }
}
