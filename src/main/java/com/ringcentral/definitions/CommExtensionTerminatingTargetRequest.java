package com.ringcentral.definitions;


public class CommExtensionTerminatingTargetRequest {
    /**
     * Terminating target type
     * Required
     * Example: ExtensionTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;
    /**
     * Required
     */
    public CommReferencedExtensionResource extension;
    /**
     * Required
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;

    public CommExtensionTerminatingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    public CommExtensionTerminatingTargetRequest extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommExtensionTerminatingTargetRequest dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
