package com.ringcentral.definitions;

public class CommPhoneNumberForwardingTargetResource {
    /**
     * Ring target type Required Example: PhoneNumberRingTarget Enum: CoworkerAppsRingTarget,
     * CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, FmcPhoneNumberRingTarget,
     * IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;

    public CommPhoneNumberForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommPhoneNumberResource destination;

    public CommPhoneNumberForwardingTargetResource destination(
            CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
