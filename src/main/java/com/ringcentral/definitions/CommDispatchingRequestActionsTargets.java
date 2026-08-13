package com.ringcentral.definitions;

public class CommDispatchingRequestActionsTargets {
    /**
     * Terminating target type Example: CloudConnectorTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget, CloudConnectorTerminatingTarget
     */
    public String type;

    public CommDispatchingRequestActionsTargets type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommDispatchingRequestActionsTargets extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommDeviceRequest device;

    public CommDispatchingRequestActionsTargets device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    /** */
    public CommCloudDestination destination;

    public CommDispatchingRequestActionsTargets destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** */
    public CommIntegrationRequest integration;

    public CommDispatchingRequestActionsTargets integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    /** The customised target name Example: Cloud Connector Contact */
    public String name;

    public CommDispatchingRequestActionsTargets name(String name) {
        this.name = name;
        return this;
    }

    /** */
    public CommTerminatingPromptResource prompt;

    public CommDispatchingRequestActionsTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommDispatchingRequestActionsTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
