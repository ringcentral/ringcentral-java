package com.ringcentral.definitions;


/**
 * All Mobile Ring target
 */
public class CommAllMobileRingAlwaysRingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Ring target type. Applicable for all desktop and mobile applications.
     * Ensures applications ring all the time during a call
     * Required
     * Example: AllMobileRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;

    public CommAllMobileRingAlwaysRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommAllMobileRingAlwaysRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommAllMobileRingAlwaysRingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
