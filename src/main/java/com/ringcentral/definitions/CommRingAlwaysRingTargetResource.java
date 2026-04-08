package com.ringcentral.definitions;

public class CommRingAlwaysRingTargetResource {
    /** */
    public String name;

    public CommRingAlwaysRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Ring target type. Applicable for all desktop and mobile applications. Ensures applications
     * ring all the time during a call Required Enum: AllDesktopRingTarget, AllMobileRingTarget
     */
    public String type;

    public CommRingAlwaysRingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
