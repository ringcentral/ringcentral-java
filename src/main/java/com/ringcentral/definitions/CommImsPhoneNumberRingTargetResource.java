package com.ringcentral.definitions;

public class CommImsPhoneNumberRingTargetResource {
    /** */
    public String name;

    public CommImsPhoneNumberRingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Ring target type Required Example: ImsPhoneNumberRingTarget Enum: AllDesktopRingTarget,
     * AllMobileRingTarget, CoworkerRingTarget, DeviceRingTarget, HotdeskRingTarget,
     * ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget, IntegrationRingTarget,
     * PhoneNumberRingTarget
     */
    public String type;

    public CommImsPhoneNumberRingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommPhoneNumberResource destination;

    public CommImsPhoneNumberRingTargetResource destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
