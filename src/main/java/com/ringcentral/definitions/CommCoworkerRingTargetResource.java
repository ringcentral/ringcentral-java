package com.ringcentral.definitions;


/**
 * Ring target
 */
public class CommCoworkerRingTargetResource {
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    /**
     * Ring target type
     * Required
     * Example: CoworkerRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     *
     */
    public String name;

    public CommCoworkerRingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommCoworkerRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommCoworkerRingTargetResource name(String name) {
        this.name = name;
        return this;
    }
}
