package com.ringcentral.definitions;

public class CommStateDispatchingResourceActionsTargets {
    /** */
    public String name;

    public CommStateDispatchingResourceActionsTargets name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type Example: CloudConnectorTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget, CloudConnectorTerminatingTarget
     */
    public String type;

    public CommStateDispatchingResourceActionsTargets type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CommReferencedExtensionResource extension;

    public CommStateDispatchingResourceActionsTargets extension(
            CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    /** */
    public CommDeviceResource device;

    public CommStateDispatchingResourceActionsTargets device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    /** */
    public CommCloudDestination destination;

    public CommStateDispatchingResourceActionsTargets destination(
            CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** */
    public CommIntegrationResource integration;

    public CommStateDispatchingResourceActionsTargets integration(
            CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }

    /** */
    public CommTerminatingPromptResource prompt;

    public CommStateDispatchingResourceActionsTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommStateDispatchingResourceActionsTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
