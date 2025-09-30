package com.ringcentral.definitions;


/**
 * All Mobile Ring target
 */
public class CommAllMobileTargetResource {
    /**
     *
     */
    public CommReferencedExtensionResource extension;
    /**
     * Required
     */
    public String name;
    /**
     * Example: AllMobileRingTarget
     * Enum: AllMobileRingTarget
     */
    public String type;

    public CommAllMobileTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommAllMobileTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommAllMobileTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
