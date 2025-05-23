package com.ringcentral.definitions;


public class CommImsPhoneNumberTargetResource {
    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    /**
     * Ring target type
     * Example: ImsPhoneNumberRingTarget
     * Enum: ImsPhoneNumberRingTarget
     */
    public String type;

    public CommImsPhoneNumberTargetResource destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommImsPhoneNumberTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
