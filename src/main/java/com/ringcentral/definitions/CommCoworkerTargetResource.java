package com.ringcentral.definitions;


/**
 * Ring target
 */
public class CommCoworkerTargetResource {
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    /**
     * Type of a ring target
     * Example: CoworkerRingTarget
     * Enum: CoworkerRingTarget
     */
    public String type;

    public CommCoworkerTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommCoworkerTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
