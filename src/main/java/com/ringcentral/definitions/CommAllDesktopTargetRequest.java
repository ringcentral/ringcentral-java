package com.ringcentral.definitions;


/**
 * All Desktop Ring target
 */
public class CommAllDesktopTargetRequest {
    /**
     *
     */
    public CommReferencedExtensionResource extension;
    /**
     * Example: AllDesktopRingTarget
     * Enum: AllDesktopRingTarget
     */
    public String type;

    public CommAllDesktopTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommAllDesktopTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
