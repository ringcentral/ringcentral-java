package com.ringcentral.definitions;


/**
 * Coworker apps target
 */
public class CommCoworkerAppsRingTargetRequest {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: CoworkerAppsRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;

    public CommCoworkerAppsRingTargetRequest name(String name) {
        this.name = name;
        return this;
    }

    public CommCoworkerAppsRingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommCoworkerAppsRingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
