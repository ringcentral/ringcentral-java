package com.ringcentral.definitions;


public class CommPlayAnnouncementTerminatingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Terminating target type
     * Required
     * Example: PlayAnnouncementTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
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

    public CommPlayAnnouncementTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommPlayAnnouncementTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommPlayAnnouncementTerminatingTargetResource prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    public CommPlayAnnouncementTerminatingTargetResource dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
