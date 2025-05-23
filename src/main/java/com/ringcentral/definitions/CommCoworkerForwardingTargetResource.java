package com.ringcentral.definitions;


/**
 * Ring target
 */
public class CommCoworkerForwardingTargetResource {
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    /**
     * Ring target type
     * Required
     * Example: CoworkerRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     *
     */
    public String name;

    public CommCoworkerForwardingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommCoworkerForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommCoworkerForwardingTargetResource name(String name) {
        this.name = name;
        return this;
    }
}
