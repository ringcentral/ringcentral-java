package com.ringcentral.definitions;


public class CommPhoneNumberTerminatingTargetRequest
{
    /**
     * Terminating target type
     * Required
     * Example: PhoneNumberTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String type;
    public CommPhoneNumberTerminatingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Phone number name
     */
    public String name;
    public CommPhoneNumberTerminatingTargetRequest name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommPhoneNumberTerminatingTargetRequest destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }

    /**
     * Required
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;
    public CommPhoneNumberTerminatingTargetRequest dispatchingType(String dispatchingType)
    {
        this.dispatchingType = dispatchingType;
        return this;
    }
}