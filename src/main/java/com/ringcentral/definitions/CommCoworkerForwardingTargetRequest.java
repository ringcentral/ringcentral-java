package com.ringcentral.definitions;


/**
 * Ring target
 */
public class CommCoworkerForwardingTargetRequest {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: CoworkerRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;

    public CommCoworkerForwardingTargetRequest name(String name) {
        this.name = name;
        return this;
    }

    public CommCoworkerForwardingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommCoworkerForwardingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
