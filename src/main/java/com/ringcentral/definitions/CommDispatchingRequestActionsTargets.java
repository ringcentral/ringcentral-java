package com.ringcentral.definitions;


public class CommDispatchingRequestActionsTargets {
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
    public CommDeviceRequest device;
    /**
     *
     */
    public CommPhoneNumberResource destination;
    /**
     *
     */
    public CommIntegrationRequest integration;
    /**
     * Phone number name
     */
    public String name;
    /**
     *
     */
    public CommTerminatingPromptResource prompt;
    /**
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;

    public CommDispatchingRequestActionsTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommDispatchingRequestActionsTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommDispatchingRequestActionsTargets device(CommDeviceRequest device) {
        this.device = device;
        return this;
    }

    public CommDispatchingRequestActionsTargets destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommDispatchingRequestActionsTargets integration(CommIntegrationRequest integration) {
        this.integration = integration;
        return this;
    }

    public CommDispatchingRequestActionsTargets name(String name) {
        this.name = name;
        return this;
    }

    public CommDispatchingRequestActionsTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    public CommDispatchingRequestActionsTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
