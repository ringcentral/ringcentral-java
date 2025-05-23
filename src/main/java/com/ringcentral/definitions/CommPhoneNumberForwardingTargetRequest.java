package com.ringcentral.definitions;


public class CommPhoneNumberForwardingTargetRequest {
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

    public CommPhoneNumberForwardingTargetRequest name(String name) {
        this.name = name;
        return this;
    }

    public CommPhoneNumberForwardingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommPhoneNumberForwardingTargetRequest destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
