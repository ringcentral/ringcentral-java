package com.ringcentral.definitions;


/**
 * All Desktop Ring target
 */
public class CommAllDesktopRingTargetRequest {
    /**
     * Ring target type
     * Required
     * Example: AllDesktopRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     *
     */
    public CommReferencedExtensionResource extension;

    public CommAllDesktopRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommAllDesktopRingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
