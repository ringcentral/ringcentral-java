package com.ringcentral.definitions;


/**
 * All Mobile Ring target
 */
public class CommAllMobileRingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: AllMobileRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     *
     */
    public CommReferencedExtensionResource extension;

    public CommAllMobileRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommAllMobileRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommAllMobileRingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
