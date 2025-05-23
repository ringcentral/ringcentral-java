package com.ringcentral.definitions;


/**
 * Notification delivery transport information
 */
public class AnyPublicDeliveryModeRequest {
    /**
     * The transport type for this subscription, or the channel by which an app should be notified of an event
     * Required
     * Enum: WebHook
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
     * An optional validation token used to verify the authenticity of the incoming webhook. Applicable only for the `WebHook` transport type.
     */
    public String verificationToken;

    public AnyPublicDeliveryModeRequest transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public AnyPublicDeliveryModeRequest address(String address) {
        this.address = address;
        return this;
    }

    public AnyPublicDeliveryModeRequest verificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
        return this;
    }
}
