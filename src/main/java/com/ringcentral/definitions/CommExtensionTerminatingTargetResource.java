package com.ringcentral.definitions;


public class CommExtensionTerminatingTargetResource {
    /**
     * Required
     */
    public String name;
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

    public CommExtensionTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommExtensionTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    public CommExtensionTerminatingTargetResource extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommExtensionTerminatingTargetResource dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
