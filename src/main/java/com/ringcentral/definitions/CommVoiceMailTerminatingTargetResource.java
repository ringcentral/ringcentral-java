package com.ringcentral.definitions;


public class CommVoiceMailTerminatingTargetResource
{
    /**
     * Required
     */
    public String name;
    public CommVoiceMailTerminatingTargetResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type
     * Required
     * Example: VoiceMailTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String type;
    public CommVoiceMailTerminatingTargetResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommVoiceMailTerminatingTargetResource extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Required
     */
    public CommTerminatingPromptResource prompt;
    public CommVoiceMailTerminatingTargetResource prompt(CommTerminatingPromptResource prompt)
    {
        this.prompt = prompt;
        return this;
    }
}