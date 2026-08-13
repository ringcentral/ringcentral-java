package com.ringcentral.definitions;

/** Ring target */
public class CommCloudConnectorTargetRequest {
    /** Required */
    public CommCloudDestination destination;

    public CommCloudConnectorTargetRequest destination(CommCloudDestination destination) {
        this.destination = destination;
        return this;
    }

    /** Type of a ring target Example: CloudConnectorRingTarget Enum: CloudConnectorRingTarget */
    public String type;

    public CommCloudConnectorTargetRequest type(String type) {
        this.type = type;
        return this;
    }

    /** Required Example: Cloud Connector Contact */
    public String name;

    public CommCloudConnectorTargetRequest name(String name) {
        this.name = name;
        return this;
    }
}
