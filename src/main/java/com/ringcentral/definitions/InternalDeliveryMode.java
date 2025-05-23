package com.ringcentral.definitions;


public class InternalDeliveryMode {
    /**
     * The transport type for this subscription
     * Required
     * Enum: Internal
     */
    public String transportType;
    /**
     * (Only for an `Internal` transport)
     * The name of internal channel (defined in the backend service configuration) to deliver notifications through.
     * Required
     * Example: my-server-channel
     */
    public String configName;

    public InternalDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public InternalDeliveryMode configName(String configName) {
        this.configName = configName;
        return this;
    }
}
