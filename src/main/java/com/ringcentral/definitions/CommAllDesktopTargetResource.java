package com.ringcentral.definitions;


/**
 * All Desktop Ring target
 */
public class CommAllDesktopTargetResource {
    /**
     *
     */
    public CommReferencedExtensionResource extension;
    /**
     * Required
     */
    public String name;
    /**
     * Example: AllDesktopRingTarget
     * Enum: AllDesktopRingTarget
     */
    public String type;

    public CommAllDesktopTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommAllDesktopTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommAllDesktopTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
