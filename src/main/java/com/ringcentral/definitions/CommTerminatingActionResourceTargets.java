package com.ringcentral.definitions;


public class CommTerminatingActionResourceTargets {
    /**
     *
     */
    public String name;
    /**
     * Terminating target type
     * Example: ExtensionTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
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
     *
     */
    public CommPhoneNumberResource destination;

    public CommTerminatingActionResourceTargets name(String name) {
        this.name = name;
        return this;
    }

    public CommTerminatingActionResourceTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommTerminatingActionResourceTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommTerminatingActionResourceTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    public CommTerminatingActionResourceTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }

    public CommTerminatingActionResourceTargets destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }
}
