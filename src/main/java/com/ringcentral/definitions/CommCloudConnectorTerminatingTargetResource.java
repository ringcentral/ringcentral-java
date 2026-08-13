package com.ringcentral.definitions;

public class CommCloudConnectorTerminatingTargetResource {
    /** Required */
    public String name;

    public CommCloudConnectorTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Terminating target type Required Example: CloudConnectorTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget, CloudConnectorTerminatingTarget
     */
    public String type;

    public CommCloudConnectorTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommCloudDestination destination;

    public CommCloudConnectorTerminatingTargetResource destination(
            CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** Required Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommCloudConnectorTerminatingTargetResource dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }
}
