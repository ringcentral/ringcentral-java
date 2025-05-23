package com.ringcentral.definitions;


public class CommPhoneNumberForwardingTargetResource {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: PhoneNumberRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommPhoneNumberResource destination;

    public CommPhoneNumberForwardingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommPhoneNumberForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommPhoneNumberForwardingTargetResource destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
