package com.ringcentral.definitions;

public class CommTerminatingActionRequestTargets {
    /**
     * Terminating target type Example: ExtensionTerminatingTarget Enum: ExtensionTerminatingTarget,
     * PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String type;

    public CommTerminatingActionRequestTargets type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommTerminatingActionRequestTargets extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommTerminatingPromptResource prompt;

    public CommTerminatingActionRequestTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommTerminatingActionRequestTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }

    /** Phone number name */
    public String name;

    public CommTerminatingActionRequestTargets name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public CommPhoneNumberResource destination;

    public CommTerminatingActionRequestTargets destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
