package com.ringcentral.definitions;

public class CommCloudConnectorTerminatingTargetRequest {
    /**
     * Terminating target type Required Example: CloudConnectorTerminatingTarget Enum:
     * ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget,
     * VoiceMailTerminatingTarget, CloudConnectorTerminatingTarget
     */
    public String type;

    public CommCloudConnectorTerminatingTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required */
    public CommCloudDestination destination;

    public CommCloudConnectorTerminatingTargetRequest destination(
            CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** Required Enum: Ringing, Terminating */
    public String dispatchingType;

    public CommCloudConnectorTerminatingTargetRequest dispatchingType(String dispatchingType) {
        this.dispatchingType = dispatchingType;
        return this;
    }

    /** The customised target name Required */
    public String name;

    public CommCloudConnectorTerminatingTargetRequest name(String name) {
        this.name = name;
        return this;
    }
}
