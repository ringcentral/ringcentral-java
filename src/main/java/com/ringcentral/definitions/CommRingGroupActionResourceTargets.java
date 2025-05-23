package com.ringcentral.definitions;


public class CommRingGroupActionResourceTargets {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Example: PhoneNumberRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
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

    public CommRingGroupActionResourceTargets name(String name) {
        this.name = name;
        return this;
    }

    public CommRingGroupActionResourceTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommRingGroupActionResourceTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommRingGroupActionResourceTargets device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    public CommRingGroupActionResourceTargets destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommRingGroupActionResourceTargets integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }
}
