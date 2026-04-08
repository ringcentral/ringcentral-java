package com.ringcentral.definitions;

public class CommExtensionTerminatingTargetRequest {
    /**
     * Terminating target type Required Example: ExtensionTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget
     */
    public String type;

    public CommExtensionTerminatingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommReferencedExtensionResource extension;

    public CommExtensionTerminatingTargetRequest extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** Required Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommExtensionTerminatingTargetRequest dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
