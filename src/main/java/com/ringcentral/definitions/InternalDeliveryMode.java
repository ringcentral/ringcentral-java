package com.ringcentral.definitions;


public class InternalDeliveryMode {
    /**
     * The transport type for this subscription, or the channel by which an app should be notified of an event
     * Required
     * Enum: Internal
     */
    public String transportType;
    /**
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
