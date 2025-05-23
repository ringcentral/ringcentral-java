package com.ringcentral.definitions;


public class CommImsPhoneNumberForwardingTargetResource {
    /**
     *
     */
    public String name;
    /**
     * Ring target type
     * Required
     * Example: ImsPhoneNumberRingTarget
     * Enum: CoworkerAppsRingTarget, CoworkerRingTarget, DeviceRingTarget, ImsPhoneNumberRingTarget, IntegrationRingTarget, PhoneNumberRingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommPhoneNumberResource destination;

    public CommImsPhoneNumberForwardingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommImsPhoneNumberForwardingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommImsPhoneNumberForwardingTargetResource destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
