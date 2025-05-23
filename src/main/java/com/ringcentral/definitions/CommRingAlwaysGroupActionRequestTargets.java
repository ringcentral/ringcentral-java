package com.ringcentral.definitions;


public class CommRingAlwaysGroupActionRequestTargets {
    /**
     * Ring target type
     * Example: AllMobileRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     *
     */
    public CommReferencedExtensionResource extension;

    public CommRingAlwaysGroupActionRequestTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommRingAlwaysGroupActionRequestTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
