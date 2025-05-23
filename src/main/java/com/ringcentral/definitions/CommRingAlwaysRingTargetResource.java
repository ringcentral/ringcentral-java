package com.ringcentral.definitions;


public class CommRingAlwaysRingTargetResource {
    /**
     *
     */
    public String name;
    /**
     * Ring target type. Applicable for all desktop and mobile applications.
     * Ensures applications ring all the time during a call
     * Required
     * Enum: AllDesktopRingTarget, AllMobileRingTarget
     */
    public String type;

    public CommRingAlwaysRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommRingAlwaysRingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
