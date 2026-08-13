package com.ringcentral.definitions;

/** Ring target */
public class CloudConnectorTargetRequest {
    /** Required */
    public CommCloudDestination destination;

    public CloudConnectorTargetRequest destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** Type of a ring target Example: CloudConnectorRingTarget Enum: CloudConnectorRingTarget */
    public String type;

    public CloudConnectorTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
