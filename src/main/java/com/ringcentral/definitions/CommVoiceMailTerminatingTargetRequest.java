package com.ringcentral.definitions;


public class CommVoiceMailTerminatingTargetRequest {
    /**
     * Terminating target type
     * Required
     * Example: VoiceMailTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
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

    public CommVoiceMailTerminatingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommVoiceMailTerminatingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommVoiceMailTerminatingTargetRequest prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }
}
