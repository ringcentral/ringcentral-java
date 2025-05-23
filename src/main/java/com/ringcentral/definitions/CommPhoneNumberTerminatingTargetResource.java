package com.ringcentral.definitions;


public class CommPhoneNumberTerminatingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Terminating target type
     * Required
     * Example: PhoneNumberTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    /**
     * Required
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;

    public CommPhoneNumberTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommPhoneNumberTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommPhoneNumberTerminatingTargetResource destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommPhoneNumberTerminatingTargetResource dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
