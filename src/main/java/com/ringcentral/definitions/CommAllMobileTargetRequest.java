package com.ringcentral.definitions;


/**
 * All Mobile Ring target
 */
public class CommAllMobileTargetRequest {
    /**
     *
     */
    public CommReferencedExtensionResource extension;
    /**
     * Example: AllMobileRingTarget
     * Enum: AllMobileRingTarget
     */
    public String type;

    public CommAllMobileTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommAllMobileTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
