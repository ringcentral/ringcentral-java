package com.ringcentral.definitions;


public class CommStateDispatchingResourceActionsTargets
{
    /**
     */
    public String name;
    public CommStateDispatchingResourceActionsTargets name(String name)
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
    public CommStateDispatchingResourceActionsTargets type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public CommReferencedExtensionResource extension;
    public CommStateDispatchingResourceActionsTargets extension(CommReferencedExtensionResource extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     */
    public CommDeviceResource device;
    public CommStateDispatchingResourceActionsTargets device(CommDeviceResource device)
    {
        this.device = device;
        return this;
    }

    /**
     */
    public CommPhoneNumberResource destination;
    public CommStateDispatchingResourceActionsTargets destination(CommPhoneNumberResource destination)
    {
        this.destination = destination;
        return this;
    }

    /**
     */
    public CommIntegrationResource integration;
    public CommStateDispatchingResourceActionsTargets integration(CommIntegrationResource integration)
    {
        this.integration = integration;
        return this;
    }

    /**
     */
    public CommTerminatingPromptResource prompt;
    public CommStateDispatchingResourceActionsTargets prompt(CommTerminatingPromptResource prompt)
    {
        this.prompt = prompt;
        return this;
    }

    /**
     * Enum: Ringing, Terminating
     */
    public String dispatchingType;
    public CommStateDispatchingResourceActionsTargets dispatchingType(String dispatchingType)
    {
        this.dispatchingType = dispatchingType;
        return this;
    }
}