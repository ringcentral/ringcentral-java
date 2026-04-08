package com.ringcentral.definitions;


public class CommPhoneNumberTerminatingTargetResource
{
    /**
     * Required
     */
    public String name;
    public CommPhoneNumberTerminatingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type
     * Required
     * Example: PhoneNumberTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String type;
    public CommPhoneNumberTerminatingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommPhoneNumberResource destination;
    public CommPhoneNumberTerminatingTargetResource destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }

    /**
     * Required
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;
    public CommPhoneNumberTerminatingTargetResource dispatchingType(String dispatchingType)
    {
        this.dispatchingType = dispatchingType;
        return this;
    }
}