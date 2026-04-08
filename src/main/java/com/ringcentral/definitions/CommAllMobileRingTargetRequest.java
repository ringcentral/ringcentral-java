package com.ringcentral.definitions;

/** All Mobile Ring target */
public class CommAllMobileRingTargetRequest {
    /**
     * Ring target type Required Example: AllMobileRingTarget Enum: AllDesktopRingTarget,
     * AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget,
     * ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget
     */
    public String type;

    public CommAllMobileRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommAllMobileRingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
