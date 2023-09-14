package com.ringcentral.definitions;


public class WebhookDeliveryMode {
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
     * Specifies if notification messages will be encrypted or not.
     * Required
     * Enum: false
     */
    public Boolean encryption;

    public WebhookDeliveryMode transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public WebhookDeliveryMode address(String address) {
        this.address = address;
        return this;
    }

    public WebhookDeliveryMode encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
}
