package com.ringcentral.definitions;


public class CommStateDispatchingResourceActionsTargets {
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

    public CommStateDispatchingResourceActionsTargets name(String name) {
        this.name = name;
        return this;
    }

    public CommStateDispatchingResourceActionsTargets type(String type) {
        this.type = type;
        return this;
    }

    public CommStateDispatchingResourceActionsTargets extension(CommReferencedExtensionResource extension) {
        this.extension = extension;
        return this;
    }

    public CommStateDispatchingResourceActionsTargets device(CommDeviceResource device) {
        this.device = device;
        return this;
    }

    public CommStateDispatchingResourceActionsTargets destination(CommPhoneNumberResource destination) {
        this.destination = destination;
        return this;
    }

    public CommStateDispatchingResourceActionsTargets integration(CommIntegrationResource integration) {
        this.integration = integration;
        return this;
    }

    public CommStateDispatchingResourceActionsTargets prompt(CommTerminatingPromptResource prompt) {
        this.prompt = prompt;
        return this;
    }

    public CommStateDispatchingResourceActionsTargets dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
