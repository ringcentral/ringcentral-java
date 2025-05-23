package com.ringcentral.definitions;


/**
 * Ring target
 */
public class CommCoworkerRingTargetRequest {
    /**
     * Ring target type
     * Required
     * Example: CoworkerRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;

    public CommCoworkerRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommCoworkerRingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
