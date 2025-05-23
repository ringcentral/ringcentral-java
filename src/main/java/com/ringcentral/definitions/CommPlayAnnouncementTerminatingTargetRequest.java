package com.ringcentral.definitions;


public class CommPlayAnnouncementTerminatingTargetRequest {
    /**
     * Terminating target type
     * Required
     * Example: PlayAnnouncementTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommTerminatingPromptResource prompt;
    /**
     * Required
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;

    public CommPlayAnnouncementTerminatingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommPlayAnnouncementTerminatingTargetRequest prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    public CommPlayAnnouncementTerminatingTargetRequest dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
