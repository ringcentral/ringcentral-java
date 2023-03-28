package com.ringcentral.definitions;


public class WebhookDeliveryMode {
    /**
     * Notifications transport type
     * Required
     * Enum: WebHook
     */
    public String transportType;
    /**
     * (Only for a &quot;WebHook&quot; transport, required) URL of a subscriber&#039;s web service
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
