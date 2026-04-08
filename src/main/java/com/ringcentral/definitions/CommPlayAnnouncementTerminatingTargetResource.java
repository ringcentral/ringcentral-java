package com.ringcentral.definitions;

public class CommPlayAnnouncementTerminatingTargetResource {
    /** Required */
    public String name;

    public CommPlayAnnouncementTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type Required Example: PlayAnnouncementTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget
     */
    public String type;

    public CommPlayAnnouncementTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommTerminatingPromptResource prompt;

    public CommPlayAnnouncementTerminatingTargetResource prompt(
            CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Required Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommPlayAnnouncementTerminatingTargetResource dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
