package com.ringcentral.definitions;

/** Ring target */
public class CommCoworkerForwardingTargetRequest {
    /** */
    public String name;

    public CommCoworkerForwardingTargetRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Ring target type Required Example: CoworkerRingTarget Enum: CoworkerAppsRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget
     */
    public String type;

    public CommCoworkerForwardingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommReferencedExtensionResource extension;

    public CommCoworkerForwardingTargetRequest extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
