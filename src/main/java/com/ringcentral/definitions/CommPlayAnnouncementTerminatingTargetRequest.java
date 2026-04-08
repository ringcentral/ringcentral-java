package com.ringcentral.definitions;


public class CommPlayAnnouncementTerminatingTargetRequest
{
    /**
     * Terminating target type
     * Required
     * Example: PlayAnnouncementTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String type;
    public CommPlayAnnouncementTerminatingTargetRequest type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Required
     */
    public CommTerminatingPromptResource prompt;
    public CommPlayAnnouncementTerminatingTargetRequest prompt(CommTerminatingPromptResource prompt)
    {
        this.prompt = prompt;
        return this;
    }

    /**
     * Required
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;
    public CommPlayAnnouncementTerminatingTargetRequest dispatchingType(String dispatchingType)
    {
        this.dispatchingType = dispatchingType;
        return this;
    }
}