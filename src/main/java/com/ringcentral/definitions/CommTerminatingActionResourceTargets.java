package com.ringcentral.definitions;

public class CommTerminatingActionResourceTargets {
    /** */
    public String name;

    public CommTerminatingActionResourceTargets name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type Example: CloudConnectorTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget, CloudConnectorTerminatingTarget
     */
    public String type;

    public CommTerminatingActionResourceTargets type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommTerminatingActionResourceTargets extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommTerminatingPromptResource prompt;

    public CommTerminatingActionResourceTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommTerminatingActionResourceTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }

    /** */
    public CommCloudDestination destination;

    public CommTerminatingActionResourceTargets destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }
}
