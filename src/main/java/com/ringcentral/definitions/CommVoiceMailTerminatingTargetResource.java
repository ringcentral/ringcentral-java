package com.ringcentral.definitions;


public class CommVoiceMailTerminatingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Terminating target type
     * Required
     * Example: VoiceMailTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;
    /**
     *
     */
    public CommReferencedExtensionResource extension;
    /**
     * Required
     */
    public CommTerminatingPromptResource prompt;

    public CommVoiceMailTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommVoiceMailTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommVoiceMailTerminatingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommVoiceMailTerminatingTargetResource prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }
}
