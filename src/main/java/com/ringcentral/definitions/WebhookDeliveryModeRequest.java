package com.ringcentral.definitions;


public class WebhookDeliveryModeRequest
{
    /**
     * The transport type for this subscription, or the channel by which an app should be notified of an event
     * Required
     * Enum: WebHook
     */
    public String transportType;
    public WebhookDeliveryModeRequest transportType(String transportType)
    {
        this.transportType = transportType;
        return this;
    }

    /**
     * The URL to which notifications should be delivered. This is only applicable for the `WebHook` transport type, for which it is a required field.
     * Required
     * Format: uri
     * Example: https://acme.com/myservice/webhook
     */
    public String address;
    public WebhookDeliveryModeRequest address(String address)
    {
        this.address = address;
        return this;
    }

    /**
     * An optional validation token used to verify the authenticity of the incoming webhook. Applicable only for the `WebHook` transport type.
     */
    public String verificationToken;
    public WebhookDeliveryModeRequest verificationToken(String verificationToken)
    {
        this.verificationToken = verificationToken;
        return this;
    }
}