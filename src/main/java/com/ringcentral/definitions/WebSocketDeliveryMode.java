package com.ringcentral.definitions;


public class WebSocketDeliveryMode {
    /**
     * The transport type for this subscription, or the channel by which an app should be notified of an event
     * Required
     * Enum: WebSocket
     */
    public String transportType;

    public WebSocketDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
}
