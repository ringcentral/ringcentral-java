package com.ringcentral.definitions;

public class CommExtensionTerminatingTargetResource {
    /** Required */
    public String name;

    public CommExtensionTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type Required Example: ExtensionTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget
     */
    public String type;

    public CommExtensionTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommReferencedExtensionResource extension;

    public CommExtensionTerminatingTargetResource extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** Required Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommExtensionTerminatingTargetResource dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
