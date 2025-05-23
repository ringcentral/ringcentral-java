package com.ringcentral.definitions;


/**
 * Notification delivery transport information
 */
public class AnyPublicDeliveryMode {
    /**
     * The transport type for this subscription
     * Required
     * Enum: WebHook, WebSocket
     */
    public String transportType;
    /**
     * The URL to which notifications should be delivered. This is only applicable for the `WebHook` transport type, for which it is a required field.
     * Required
     * Format: uri
     * Example: https://acme.com/myservice/webhook
     */
    public String address;
    /**
     * Specifies if notification messages will be encrypted or not.
     * Required
     * Enum: false
     */
    public Boolean encryption;

    public AnyPublicDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public AnyPublicDeliveryMode address(String address) {
        this.address = address;
        return this;
    }

    public AnyPublicDeliveryMode encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
}
