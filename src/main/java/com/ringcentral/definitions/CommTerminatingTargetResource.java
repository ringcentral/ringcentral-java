package com.ringcentral.definitions;


public class CommTerminatingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Terminating target type
     * Required
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;

    public CommTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
