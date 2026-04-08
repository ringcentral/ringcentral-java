package com.ringcentral.definitions;


public class CommInteractionDispatchingResourceActionsTargets
{
    /**
     */
    public String name;
    public CommInteractionDispatchingResourceActionsTargets name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type
     * Example: ExtensionTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget
     */
    public String type;
    public CommInteractionDispatchingResourceActionsTargets type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommInteractionDispatchingResourceActionsTargets extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     */
    public CommDeviceResource device;
    public CommInteractionDispatchingResourceActionsTargets device(CommDeviceResource device)
    {
        this.device = device;
        return this;
    }

    /**
     */
    public CommPhoneNumberResource destination;
    public CommInteractionDispatchingResourceActionsTargets destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }

    /**
     */
    public CommIntegrationResource integration;
    public CommInteractionDispatchingResourceActionsTargets integration(CommIntegrationResource integration)
    {
        this.integration = integration;
        return this;
    }

    /**
     */
    public CommTerminatingPromptResource prompt;
    public CommInteractionDispatchingResourceActionsTargets prompt(CommTerminatingPromptResource prompt)
    {
        this.prompt = prompt;
        return this;
    }

    /**
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;
    public CommInteractionDispatchingResourceActionsTargets dispatchingType(String dispatchingType)
    {
        this.dispatchingType = dispatchingType;
        return this;
    }
}