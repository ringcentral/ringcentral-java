package com.ringcentral.definitions;


/**
 * All Desktop Ring target
 */
public class CommAllDesktopRingAlwaysRingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Ring target type. Applicable for all desktop and mobile applications.
     * Ensures applications ring all the time during a call
     * Required
     * Example: AllDesktopRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget
     */
    public String type;
    /**
     *
     */
    public CommReferencedExtensionResource extension;

    public CommAllDesktopRingAlwaysRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommAllDesktopRingAlwaysRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommAllDesktopRingAlwaysRingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
