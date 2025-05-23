package com.ringcentral.definitions;


public class CommPhoneNumberTargetResource {
    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    /**
     * Ring target type
     * Example: PhoneNumberRingTarget
     * Enum: PhoneNumberRingTarget
     */
    public String type;

    public CommPhoneNumberTargetResource destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommPhoneNumberTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
