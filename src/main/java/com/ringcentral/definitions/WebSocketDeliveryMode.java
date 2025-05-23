package com.ringcentral.definitions;


public class WebSocketDeliveryMode {
    /**
     * The transport type for this subscription
     * Required
     * Enum: WebSocket
     */
    public String transportType;

    public WebSocketDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
}
