package com.ringcentral.definitions;


/**
 * Coworker apps target
 */
public class CommCoworkerAppsRingTargetResource {
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

    public CommCoworkerAppsRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommCoworkerAppsRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommCoworkerAppsRingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
