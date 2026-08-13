package com.ringcentral.definitions;

public class CommTerminatingActionRequestTargets {
    /**
     * Terminating target type Example: CloudConnectorTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget, CloudConnectorTerminatingTarget
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

    /** The customised target name */
    public String name;

    public CommTerminatingActionRequestTargets name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public CommCloudDestination destination;

    public CommTerminatingActionRequestTargets destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }
}
