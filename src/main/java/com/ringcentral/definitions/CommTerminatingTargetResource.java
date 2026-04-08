package com.ringcentral.definitions;

public class CommTerminatingTargetResource {
    /** Required */
    public String name;

    public CommTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type Required Enum: ExtensionTerminatingTarget,
     * PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String type;

    public CommTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
