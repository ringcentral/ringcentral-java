package com.ringcentral.definitions;

/** All Desktop Ring target */
public class CommAllDesktopTargetResource {
    /** */
    public CommReferencedExtensionResource extension;

    public CommAllDesktopTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** Required */
    public String name;

    public CommAllDesktopTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /** Example: AllDesktopRingTarget Enum: AllDesktopRingTarget */
    public String type;

    public CommAllDesktopTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
