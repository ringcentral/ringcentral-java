package com.ringcentral.definitions;


public class CommPhoneNumberTerminatingTargetRequest {
    /**
     * Terminating target type
     * Required
     * Example: PhoneNumberTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;
    /**
     * Phone number name
     */
    public String name;
    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    /**
     * Required
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;

    public CommPhoneNumberTerminatingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommPhoneNumberTerminatingTargetRequest name(String name) {
        this.name = name;
        return this;
    }

    public CommPhoneNumberTerminatingTargetRequest destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommPhoneNumberTerminatingTargetRequest dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
