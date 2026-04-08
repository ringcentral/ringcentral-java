package com.ringcentral.definitions;

public class CommFmcPhoneNumberForwardingTargetResource {
    /**
     * Ring target type Required Example: FmcPhoneNumberRingTarget Enum: CoworkerAppsRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget,
     * IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommFmcPhoneNumberForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommPhoneNumberResource destination;

    public CommFmcPhoneNumberForwardingTargetResource destination(
            CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
