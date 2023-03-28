package com.ringcentral.definitions;


public class WebhookDeliveryModeRequest {
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
     * (Only for a &quot;WebHook&quot; transport, optional) Subscription verification token
     */
    public String verificationToken;

    public WebhookDeliveryModeRequest transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    public WebhookDeliveryModeRequest address(String address) {
        this.address = address;
        return this;
    }

    public WebhookDeliveryModeRequest verificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
        return this;
    }
}
