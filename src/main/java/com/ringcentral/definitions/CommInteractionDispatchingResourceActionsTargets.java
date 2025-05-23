package com.ringcentral.definitions;


public class CommInteractionDispatchingResourceActionsTargets {
    /**
     *
     */
    public String name;
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
    public CommDeviceResource device;
    /**
     *
     */
    public CommPhoneNumberResource destination;
    /**
     *
     */
    public CommIntegrationResource integration;
    /**
     *
     */
    public CommTerminatingPromptResource prompt;
    /**
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;

    public CommInteractionDispatchingResourceActionsTargets name(String name) {
        this.name = name;
        return this;
    }

    public CommInteractionDispatchingResourceActionsTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommInteractionDispatchingResourceActionsTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommInteractionDispatchingResourceActionsTargets device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    public CommInteractionDispatchingResourceActionsTargets destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommInteractionDispatchingResourceActionsTargets integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }

    public CommInteractionDispatchingResourceActionsTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    public CommInteractionDispatchingResourceActionsTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
