package com.ringcentral.definitions;


public class CommRingAlwaysGroupActionResourceTargets {
    /**
     *
     */
    public String name;
    /**
     * Ring target type. Applicable for all desktop and mobile applications.
     * Ensures applications ring all the time during a call
     * Example: AllMobileRingTarget
     * Enum: AllDesktopRingTarget, AllMobileRingTarget
     */
    public String type;
    /**
     *
     */
    public CommReferencedExtensionResource extension;

    public CommRingAlwaysGroupActionResourceTargets name(String name) {
        this.name = name;
        return this;
    }

    public CommRingAlwaysGroupActionResourceTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommRingAlwaysGroupActionResourceTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }
}
