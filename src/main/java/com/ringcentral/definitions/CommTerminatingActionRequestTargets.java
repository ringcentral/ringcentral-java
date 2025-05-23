package com.ringcentral.definitions;


public class CommTerminatingActionRequestTargets {
    /**
     * Terminating target type
     * Example: ImsVoiceMailTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;
    /**
     *
     */
    public CommReferencedExtensionResource extension;
    /**
     *
     */
    public CommTerminatingPromptResource prompt;
    /**
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;
    /**
     * Phone number name
     */
    public String name;
    /**
     *
     */
    public CommPhoneNumberResource destination;

    public CommTerminatingActionRequestTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommTerminatingActionRequestTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommTerminatingActionRequestTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    public CommTerminatingActionRequestTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }

    public CommTerminatingActionRequestTargets name(String name) {
        this.name = name;
        return this;
    }

    public CommTerminatingActionRequestTargets destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
