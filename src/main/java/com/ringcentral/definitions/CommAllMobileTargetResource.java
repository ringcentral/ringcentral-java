package com.ringcentral.definitions;

/** All Mobile Ring target */
public class CommAllMobileTargetResource {
    /** */
    public CommReferencedExtensionResource extension;

    public CommAllMobileTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** Required */
    public String name;

    public CommAllMobileTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /** Example: AllMobileRingTarget Enum: AllMobileRingTarget */
    public String type;

    public CommAllMobileTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
