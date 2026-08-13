package com.ringcentral.definitions;

/** Ring target */
public class CommCloudConnectorTargetResource {
    /** Required */
    public CommCloudDestination destination;

    public CommCloudConnectorTargetResource destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** Type of a ring target Example: CloudConnectorRingTarget Enum: CloudConnectorRingTarget */
    public String type;

    public CommCloudConnectorTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
