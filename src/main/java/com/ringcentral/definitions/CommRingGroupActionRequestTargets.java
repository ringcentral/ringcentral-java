package com.ringcentral.definitions;


public class CommRingGroupActionRequestTargets {
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
    public CommDeviceRequest device;
    /**
     *
     */
    public CommPhoneNumberResource destination;
    /**
     *
     */
    public CommIntegrationRequest integration;
    /**
     *
     */
    public String name;

    public CommRingGroupActionRequestTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommRingGroupActionRequestTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommRingGroupActionRequestTargets device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    public CommRingGroupActionRequestTargets destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommRingGroupActionRequestTargets integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    public CommRingGroupActionRequestTargets name(String name) {
        this.name = name;
        return this;
    }
}
