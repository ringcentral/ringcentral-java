package com.ringcentral.definitions;

/** Ring target */
public class CommCoworkerTargetResource {
    /** Required */
    public CommReferencedExtensionResource extension;

    public CommCoworkerTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** Type of a ring target Example: CoworkerRingTarget Enum: CoworkerRingTarget */
    public String type;

    public CommCoworkerTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
